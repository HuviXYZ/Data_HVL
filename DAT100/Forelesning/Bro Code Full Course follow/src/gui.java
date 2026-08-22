import javax.swing.JOptionPane;

public class gui {
    public static void main(String[] args) {

        //String name = JOptionPane.showInputDialog("enter your name");
        //JOptionPane.showMessageDialog(null, "hello " + name);

        //int age = Integer.parseInt(JOptionPane.showInputDialog("enter your age"));

        //JOptionPane.showMessageDialog(null, "your name is " + name + " and your age is " + age);

       //double height = Double.parseDouble(JOptionPane.showInputDialog("enter your height in cm"));
      // JOptionPane.showMessageDialog(null, "you are" + height + " centimieters tall!");







        // jeg vil lage en gui pop up som spør meg om 3 ting.
        // 1. hva er favoritt måltidet mitt?
        // 2. har du noen allergier hva er du allerginsk mot?
        // 3. hvor mange brusflasker vil du ha, du ha? oppgi svar  i tall:
        // og så en dialog som sier, det høres godt ut, vi vil ta hensyn til dine allergier hvis du har oppgitt noen. Oppgitte allergier: alergier

        String favMåltid = JOptionPane.showInputDialog("hva er favoritt måltidet ditt?");
        String allergier = JOptionPane.showInputDialog("har du noen allergier hva er du allerginsk mot?");

        int antallBrus = Integer.parseInt(JOptionPane.showInputDialog("hvor mange brusflasker vil du ha, du ha? oppgi svar  i tall: "));

        JOptionPane.showMessageDialog(null, "Takk for informasjonen!\n" + "du har valgt " + favMåltid + " og\n " + antallBrus + "brusflasker\n" + " vi vil ta hensyn til Oppgitte allergier: " + allergier   );




    }

}
