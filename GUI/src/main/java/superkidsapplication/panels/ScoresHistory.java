/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package superkidsapplication.panels;
//import sr;
import com.ece.superkids.questions.enums.QuestionCategory;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JTable;
/**
 *
 * @author Prashant
 */
public class ScoresHistory extends javax.swing.JPanel {
    
     public List<QuestionCategory> category;
     /*   
     * Creates new form ScoresHistory
     */
//    ScrollPane Historybox = new ScrollPane();
   // JTabbedPane historytab = new JTabbedPane();
    public ScoresHistory() {
        initComponents();
        JPanel tab[] = new JPanel[3];
        JTable table[] = new JTable[3];
        //JPanel tab2 = new JPanel();
        //JPanel tab3 = new JPanel();
        category = ScoresLevel.levelques.getCategories();
        //QuestionCategory.values();
        
        for(int i =0; i< category.size(); i++)
        {   
            
            Object data[][] = {
            {"Q1", new Integer(1),new Integer(2),new Integer(3),new Integer(4),new Integer(5)},
            {"Q2", new Integer(6),new Integer(7),new Integer(8),new Integer(9),new Integer(10)},
            {"Q3", new Integer(11),new Integer(12),new Integer(13),new Integer(14),new Integer(15)},
            {"Q4", new Integer(16),new Integer(17),new Integer(18),new Integer(19),new Integer(20)},
            {"Q5", new Integer(21),new Integer(22),new Integer(23),new Integer(24),new Integer(25)},
            
        };
            
            String Columnname[] = {"Question Number","Attempt 1","Attempt 2","Attempt 3","Attempt 4","Attempt 5"};
            table[i] = new JTable(data,Columnname);
            tab[i].add(table[i]);
            
            jTabbedPane1.addTab(category.get(i).toString(),tab[i]);
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

        jSpinner1 = new javax.swing.JSpinner();
        jTabbedPane1 = new javax.swing.JTabbedPane();

        jTabbedPane1.setName("historyTabPanel"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
