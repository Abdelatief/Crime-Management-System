package GUI;
import crime.management.system.*;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 * @author Abdelatief
 */

public class CaseManagementForm extends javax.swing.JFrame {

    /**
     * Creates new form CaseManagement
     */
    DefaultListModel<String> dlm;
    public CaseManagementForm() 
    {
        initComponents();
        //OfficersList = list;
        // creating some objects for testing
        Department dep = new Department(159, "Public Safety", "5/11/2014");
        Case case1 = new Case(101, "Robbery", "House Robbery", dep, "today");
        Case case2 = new Case(103, "Scam", "Scam description", dep, "17-2-2019");
        Police_Officer officer1 = new Police_Officer(7, "James Bond", "01*****", 25000, dep);
        Police_Officer officer2 = new Police_Officer(7, "Johny English", "0******", 10000, dep);
        dep.add_officer(officer1);
        dep.add_officer(officer2);
        Vector<String> crimes = new Vector<>();
        crimes.add("crime1");
        crimes.add("crime2");
        Criminal criminal1 = new Criminal(500, "Ramsey", "Winterfell", crimes, "Super Dangerous");
        case1.add_Officer(officer1);
        case1.add_Officer(officer2);
        case1.add_criminal(criminal1);
        load_case_ids();
        CaseIdSelected();
        //////////////////////////////////////////////////
        ///add
        //////////////////////////////////////////////////
        load_departments();
        
    }
    
    public void CaseIdSelected()
    {
        int CaseID = Integer.parseInt(String.valueOf(CasesCombobox.getSelectedItem()));
//        System.out.println(CaseID);
        Case selectedCase = Case.get_case_by_id(CaseID);
//        selectedCase.displayCase();
        DescriptionField.setText(selectedCase.getDescription());
        StartDateField.setText(selectedCase.getStartDate());
        LastUpdatedDateField.setText(selectedCase.getLastUpdateDate());
        CrimeTypeField.setText(selectedCase.getCrimeType());
        DepartmentField.setText(selectedCase.getDepartment().getName());
        load_case_officers(selectedCase);
        load_case_criminals(selectedCase);
    }
    
    public void load_case_ids()
    {
        CasesCombobox.removeAllItems();
        for (int i = 0; i < Case.cases.size(); i++)
        {
            CasesCombobox.addItem(String.valueOf(Case.cases.get(i).getId()));
        }
    }
    
    public void load_case_officers(Case case_)
    {
        OfficersList.removeAll();
        Vector<Police_Officer> officers = case_.getOfficers_assigned();
        DefaultListModel m = new DefaultListModel();
        for (int i = 0; i < case_.getOfficers_assigned().size(); i++)
        {
            String name = case_.getOfficers_assigned().get(i).getName();
            int id = case_.getOfficers_assigned().get(i).getId();
            String item = id + ":" + name;
            m.addElement(id + " " + name);
        }
        OfficersList.setModel(m);
    }
    
    public void load_case_criminals(Case case_)
    {
        CriminalsList.removeAll();
        Vector<Criminal> criminals = case_.getCriminalsInvolved();
        DefaultListModel m = new DefaultListModel();
        for (int i = 0; i < criminals.size(); i++)
        {
            String name = criminals.get(i).get_name();
            int id = criminals.get(i).get_id();
            String element = id + " " + name;
            m.addElement(element);
        }
        CriminalsList.setModel(m);
    }
    
    public void load_departments()
    {
        DepartmentsCombobox.removeAllItems();
        for (int i = 0; i < Department.DepartmentsList.size(); i++)
        {
            String item = Department.DepartmentsList.get(i).getId() + " " +
            Department.DepartmentsList.get(i).getName();
            DepartmentsCombobox.addItem(item);
            System.out.println(item);
        }
        load_department_officers();
        load_department_criminals();
    }
    
    public void load_department_officers()
    {
        String[] depData = String.valueOf(DepartmentsCombobox.getSelectedItem()).split(" ");
        int depId = Integer.parseInt(depData[0]);
        Department dep = Department.get_department_by_id(depId);
        officersCombobox.removeAllItems();
        for (int i = 0 ; i < dep.getOfficerList().size(); i++)
        {
            String item = dep.getOfficerList().get(i).getId() + " " +
                    dep.getOfficerList().get(i).getName();
            officersCombobox.addItem(item);
        }
    }
    
    public void load_department_criminals()
    {
        String[] depData = String.valueOf(DepartmentsCombobox.getSelectedItem()).split(" ");
        int depId = Integer.parseInt(depData[0]);
        Department dep = Department.get_department_by_id(depId);
        CriminalsCombobox.removeAllItems();
        for (int i = 0 ; i < Criminal.criminals.size(); i++)
        {
            String item = Criminal.criminals.get(i).get_id()+ " " +
               Criminal.criminals.get(i).get_name();
            CriminalsCombobox.addItem(item);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        AddButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        ViewButton = new javax.swing.JButton();
        EditButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        CardLayoutPanel = new javax.swing.JPanel();
        ViewCasesCard = new javax.swing.JPanel();
        CasesCombobox = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        CriminalsList = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        OfficersList = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DescriptionField = new javax.swing.JTextArea();
        StartDateField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        DepartmentField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        LastUpdatedDateField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        CrimeTypeField = new javax.swing.JTextField();
        prollydelet = new javax.swing.JPanel();
        addCasesPanel = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        CriminalsList1 = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        OfficersList1 = new javax.swing.JList<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        DescriptionField1 = new javax.swing.JTextArea();
        StartDateField1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        LastUpdatedDateField1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        CrimeTypeField1 = new javax.swing.JTextField();
        StartDateField2 = new javax.swing.JTextField();
        DepartmentsCombobox = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        officersCombobox = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        CriminalsCombobox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 40, 89));

        jPanel2.setBackground(new java.awt.Color(1, 10, 25));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/logodark.jpg"))); // NOI18N

        AddButton.setBackground(new java.awt.Color(0, 26, 53));
        AddButton.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        AddButton.setForeground(new java.awt.Color(255, 255, 255));
        AddButton.setText("Add Cases");
        AddButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 59, 115)));
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        DeleteButton.setBackground(new java.awt.Color(0, 26, 53));
        DeleteButton.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        DeleteButton.setForeground(new java.awt.Color(255, 255, 255));
        DeleteButton.setText("Delete Cases");
        DeleteButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 59, 115)));

        ViewButton.setBackground(new java.awt.Color(0, 26, 53));
        ViewButton.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        ViewButton.setForeground(new java.awt.Color(255, 255, 255));
        ViewButton.setText("Vew Cases");
        ViewButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 59, 115)));
        ViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewButtonActionPerformed(evt);
            }
        });

        EditButton.setBackground(new java.awt.Color(0, 26, 53));
        EditButton.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        EditButton.setForeground(new java.awt.Color(255, 255, 255));
        EditButton.setText("Edit Cases");
        EditButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 59, 115)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DeleteButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ViewButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EditButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(65, 65, 65)
                .addComponent(ViewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 40, 89));
        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        CardLayoutPanel.setBackground(new java.awt.Color(0, 40, 89));
        CardLayoutPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        CardLayoutPanel.setLayout(new java.awt.CardLayout());

        ViewCasesCard.setBackground(new java.awt.Color(0, 40, 89));

        CasesCombobox.setBackground(new java.awt.Color(0, 26, 53));
        CasesCombobox.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        CasesCombobox.setForeground(new java.awt.Color(255, 255, 255));
        CasesCombobox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 59, 115), 3));
        CasesCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasesComboboxActionPerformed(evt);
            }
        });

        CriminalsList.setBackground(new java.awt.Color(0, 26, 53));
        CriminalsList.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 59, 115)));
        CriminalsList.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        CriminalsList.setForeground(new java.awt.Color(255, 255, 255));
        CriminalsList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        CriminalsList.setSelectionBackground(new java.awt.Color(0, 120, 187));
        jScrollPane3.setViewportView(CriminalsList);

        OfficersList.setBackground(new java.awt.Color(0, 26, 53));
        OfficersList.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 59, 115)));
        OfficersList.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        OfficersList.setForeground(new java.awt.Color(255, 255, 255));
        OfficersList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        OfficersList.setSelectionBackground(new java.awt.Color(0, 120, 187));
        jScrollPane4.setViewportView(OfficersList);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 120, 187));
        jLabel2.setText("Cases ID");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 120, 187));
        jLabel3.setText("Criminals Involved");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 28)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 120, 187));
        jLabel4.setText("Officers Assigned");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 28)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 120, 187));
        jLabel5.setText("Last Update");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 28)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 120, 187));
        jLabel6.setText("Description");

        jScrollPane1.setHorizontalScrollBar(null);

        DescriptionField.setBackground(new java.awt.Color(0, 26, 53));
        DescriptionField.setColumns(20);
        DescriptionField.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        DescriptionField.setRows(5);
        DescriptionField.setText("Text Area Test");
        DescriptionField.setEnabled(false);
        jScrollPane1.setViewportView(DescriptionField);

        StartDateField.setBackground(new java.awt.Color(0, 26, 53));
        StartDateField.setFont(new java.awt.Font("Century Gothic", 0, 26)); // NOI18N
        StartDateField.setForeground(new java.awt.Color(255, 255, 255));
        StartDateField.setText("date");
        StartDateField.setBorder(null);
        StartDateField.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 28)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 120, 187));
        jLabel7.setText("Start Date");

        DepartmentField.setBackground(new java.awt.Color(0, 26, 53));
        DepartmentField.setFont(new java.awt.Font("Century Gothic", 0, 26)); // NOI18N
        DepartmentField.setForeground(new java.awt.Color(255, 255, 255));
        DepartmentField.setText("Departmeny");
        DepartmentField.setBorder(null);
        DepartmentField.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 28)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 120, 187));
        jLabel8.setText("Department");

        LastUpdatedDateField.setBackground(new java.awt.Color(0, 26, 53));
        LastUpdatedDateField.setFont(new java.awt.Font("Century Gothic", 0, 26)); // NOI18N
        LastUpdatedDateField.setForeground(new java.awt.Color(255, 255, 255));
        LastUpdatedDateField.setText("date");
        LastUpdatedDateField.setBorder(null);
        LastUpdatedDateField.setEnabled(false);

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 28)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 120, 187));
        jLabel10.setText("Crime Type");

        CrimeTypeField.setBackground(new java.awt.Color(0, 26, 53));
        CrimeTypeField.setFont(new java.awt.Font("Century Gothic", 0, 26)); // NOI18N
        CrimeTypeField.setForeground(new java.awt.Color(255, 255, 255));
        CrimeTypeField.setText("Crime type");
        CrimeTypeField.setBorder(null);
        CrimeTypeField.setEnabled(false);

        javax.swing.GroupLayout ViewCasesCardLayout = new javax.swing.GroupLayout(ViewCasesCard);
        ViewCasesCard.setLayout(ViewCasesCardLayout);
        ViewCasesCardLayout.setHorizontalGroup(
            ViewCasesCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewCasesCardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ViewCasesCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ViewCasesCardLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewCasesCardLayout.createSequentialGroup()
                        .addGroup(ViewCasesCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ViewCasesCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(ViewCasesCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(StartDateField)
                            .addComponent(DepartmentField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LastUpdatedDateField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CrimeTypeField, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ViewCasesCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ViewCasesCardLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ViewCasesCardLayout.createSequentialGroup()
                        .addGroup(ViewCasesCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ViewCasesCardLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ViewCasesCardLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(ViewCasesCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CasesCombobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE))))
                .addContainerGap())
        );
        ViewCasesCardLayout.setVerticalGroup(
            ViewCasesCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewCasesCardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ViewCasesCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CasesCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ViewCasesCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ViewCasesCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ViewCasesCardLayout.createSequentialGroup()
                        .addGroup(ViewCasesCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ViewCasesCardLayout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39)
                        .addGroup(ViewCasesCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ViewCasesCardLayout.createSequentialGroup()
                                .addComponent(StartDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(LastUpdatedDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CrimeTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(DepartmentField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ViewCasesCardLayout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(179, Short.MAX_VALUE))
        );

        CardLayoutPanel.add(ViewCasesCard, "card3");

        prollydelet.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout prollydeletLayout = new javax.swing.GroupLayout(prollydelet);
        prollydelet.setLayout(prollydeletLayout);
        prollydeletLayout.setHorizontalGroup(
            prollydeletLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1286, Short.MAX_VALUE)
        );
        prollydeletLayout.setVerticalGroup(
            prollydeletLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 823, Short.MAX_VALUE)
        );

        CardLayoutPanel.add(prollydelet, "card2");

        addCasesPanel.setBackground(new java.awt.Color(0, 40, 89));

        CriminalsList1.setBackground(new java.awt.Color(0, 26, 53));
        CriminalsList1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 59, 115)));
        CriminalsList1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        CriminalsList1.setForeground(new java.awt.Color(255, 255, 255));
        CriminalsList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        CriminalsList1.setSelectionBackground(new java.awt.Color(0, 120, 187));
        jScrollPane5.setViewportView(CriminalsList1);

        OfficersList1.setBackground(new java.awt.Color(0, 26, 53));
        OfficersList1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 59, 115)));
        OfficersList1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        OfficersList1.setForeground(new java.awt.Color(255, 255, 255));
        OfficersList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        OfficersList1.setSelectionBackground(new java.awt.Color(0, 120, 187));
        jScrollPane6.setViewportView(OfficersList1);

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 28)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 120, 187));
        jLabel9.setText("Cases ID");

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 28)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 120, 187));
        jLabel11.setText("Criminals Involved");

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 28)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 120, 187));
        jLabel12.setText("Officers Assigned");

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 28)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 120, 187));
        jLabel13.setText("Last Update");

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 28)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 120, 187));
        jLabel14.setText("Description");

        jScrollPane2.setHorizontalScrollBar(null);

        DescriptionField1.setBackground(new java.awt.Color(0, 26, 53));
        DescriptionField1.setColumns(20);
        DescriptionField1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        DescriptionField1.setForeground(new java.awt.Color(255, 255, 255));
        DescriptionField1.setRows(5);
        DescriptionField1.setText("Text Area Test");
        jScrollPane2.setViewportView(DescriptionField1);

        StartDateField1.setBackground(new java.awt.Color(0, 26, 53));
        StartDateField1.setFont(new java.awt.Font("Century Gothic", 0, 26)); // NOI18N
        StartDateField1.setForeground(new java.awt.Color(255, 255, 255));
        StartDateField1.setText("date");
        StartDateField1.setBorder(null);

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 28)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 120, 187));
        jLabel15.setText("Start Date");

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 28)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 120, 187));
        jLabel16.setText("Department");

        LastUpdatedDateField1.setBackground(new java.awt.Color(0, 26, 53));
        LastUpdatedDateField1.setFont(new java.awt.Font("Century Gothic", 0, 26)); // NOI18N
        LastUpdatedDateField1.setForeground(new java.awt.Color(255, 255, 255));
        LastUpdatedDateField1.setText("date");
        LastUpdatedDateField1.setBorder(null);

        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 28)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 120, 187));
        jLabel17.setText("Crime Type");

        CrimeTypeField1.setBackground(new java.awt.Color(0, 26, 53));
        CrimeTypeField1.setFont(new java.awt.Font("Century Gothic", 0, 26)); // NOI18N
        CrimeTypeField1.setForeground(new java.awt.Color(255, 255, 255));
        CrimeTypeField1.setText("Crime type");
        CrimeTypeField1.setBorder(null);

        StartDateField2.setBackground(new java.awt.Color(0, 26, 53));
        StartDateField2.setFont(new java.awt.Font("Century Gothic", 0, 26)); // NOI18N
        StartDateField2.setForeground(new java.awt.Color(255, 255, 255));
        StartDateField2.setText("date");
        StartDateField2.setBorder(null);

        DepartmentsCombobox.setBackground(new java.awt.Color(0, 26, 53));
        DepartmentsCombobox.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        DepartmentsCombobox.setForeground(new java.awt.Color(255, 255, 255));
        DepartmentsCombobox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 59, 115), 3));
        DepartmentsCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepartmentsComboboxActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Century Gothic", 0, 28)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 120, 187));
        jLabel18.setText("Officers");

        officersCombobox.setBackground(new java.awt.Color(0, 26, 53));
        officersCombobox.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        officersCombobox.setForeground(new java.awt.Color(255, 255, 255));
        officersCombobox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 59, 115), 3));
        officersCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                officersComboboxActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Century Gothic", 0, 28)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 120, 187));
        jLabel19.setText("Criminals");

        CriminalsCombobox.setBackground(new java.awt.Color(0, 26, 53));
        CriminalsCombobox.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        CriminalsCombobox.setForeground(new java.awt.Color(255, 255, 255));
        CriminalsCombobox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 59, 115), 3));
        CriminalsCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CriminalsComboboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addCasesPanelLayout = new javax.swing.GroupLayout(addCasesPanel);
        addCasesPanel.setLayout(addCasesPanelLayout);
        addCasesPanelLayout.setHorizontalGroup(
            addCasesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addCasesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addCasesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addCasesPanelLayout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(CriminalsCombobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(addCasesPanelLayout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(addCasesPanelLayout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(StartDateField1))
                    .addGroup(addCasesPanelLayout.createSequentialGroup()
                        .addGroup(addCasesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addCasesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(addCasesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(addCasesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(officersCombobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LastUpdatedDateField1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(StartDateField2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CrimeTypeField1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DepartmentsCombobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addCasesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(addCasesPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addCasesPanelLayout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 28, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        addCasesPanelLayout.setVerticalGroup(
            addCasesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addCasesPanelLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(addCasesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StartDateField1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addCasesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addCasesPanelLayout.createSequentialGroup()
                        .addGroup(addCasesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(addCasesPanelLayout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39)
                        .addGroup(addCasesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addCasesPanelLayout.createSequentialGroup()
                                .addComponent(StartDateField2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(LastUpdatedDateField1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CrimeTypeField1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(addCasesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(DepartmentsCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(addCasesPanelLayout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(addCasesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(officersCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(addCasesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(18, 18, 18)
                .addGroup(addCasesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CriminalsCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        CardLayoutPanel.add(addCasesPanel, "card3");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(CardLayoutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(CardLayoutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 827, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewButtonActionPerformed
        CardLayoutPanel.removeAll();
        CardLayoutPanel.add(ViewCasesCard);
        CardLayoutPanel.repaint();
        CardLayoutPanel.revalidate();
    }//GEN-LAST:event_ViewButtonActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        CardLayoutPanel.removeAll();
        CardLayoutPanel.add(addCasesPanel);
        CardLayoutPanel.repaint();
        CardLayoutPanel.revalidate();
    }//GEN-LAST:event_AddButtonActionPerformed

    private void CasesComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasesComboboxActionPerformed
        CaseIdSelected();
    }//GEN-LAST:event_CasesComboboxActionPerformed

    private void DepartmentsComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepartmentsComboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DepartmentsComboboxActionPerformed

    private void officersComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_officersComboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_officersComboboxActionPerformed

    private void CriminalsComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CriminalsComboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CriminalsComboboxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CaseManagementForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CaseManagementForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CaseManagementForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CaseManagementForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CaseManagementForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JPanel CardLayoutPanel;
    private javax.swing.JComboBox<String> CasesCombobox;
    private javax.swing.JTextField CrimeTypeField;
    private javax.swing.JTextField CrimeTypeField1;
    private javax.swing.JComboBox<String> CriminalsCombobox;
    private javax.swing.JList<String> CriminalsList;
    private javax.swing.JList<String> CriminalsList1;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JTextField DepartmentField;
    private javax.swing.JComboBox<String> DepartmentsCombobox;
    private javax.swing.JTextArea DescriptionField;
    private javax.swing.JTextArea DescriptionField1;
    private javax.swing.JButton EditButton;
    private javax.swing.JTextField LastUpdatedDateField;
    private javax.swing.JTextField LastUpdatedDateField1;
    private javax.swing.JList<String> OfficersList;
    private javax.swing.JList<String> OfficersList1;
    private javax.swing.JTextField StartDateField;
    private javax.swing.JTextField StartDateField1;
    private javax.swing.JTextField StartDateField2;
    private javax.swing.JButton ViewButton;
    private javax.swing.JPanel ViewCasesCard;
    private javax.swing.JPanel addCasesPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JComboBox<String> officersCombobox;
    private javax.swing.JPanel prollydelet;
    // End of variables declaration//GEN-END:variables
}
