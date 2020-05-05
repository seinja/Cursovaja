import javax.swing.*;

import static javax.swing.JOptionPane.showOptionDialog;

    public class Main {
        public static  void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
            String[] names = {"1 Станок","2 Cтанка","3 Cтанка"};
            int index = showOptionDialog(null,"Выберите кол-во станков\n Подключённых к ШС","choise",JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE,null,names,names[0]);
            if(index == 0){
                mainWindowOne windowOne = new mainWindowOne();
                windowOne.windowWithOneItem(800,600);
            }else if(index == 1){
                mainWindowOne windowTwo = new mainWindowOne();
                windowTwo.windowWithTwoItem(800,600);
            }else if(index == 2){
                mainWindowOne windowTree = new mainWindowOne();
                windowTree.windowWithTreeItem(800,600);
            }else{
                JOptionPane.showMessageDialog(null,"ERROR");
            }
        }
    }


