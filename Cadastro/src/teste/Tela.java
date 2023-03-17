package teste;

import javax.swing.JOptionPane;

import Model.Usuario;
public class Tela {



	public static void main(String args[])    {

        Usuario qlcoisa = new Usuario();
        boolean repeticao = true;
        int repetidor;

    while(repeticao == true){
         qlcoisa.setNome(JOptionPane.showInputDialog(null,"Informe o nome", "Cadastro de Cliente",3));
        if(qlcoisa.getNome().equals(null)) {
        	JOptionPane.showMessageDialog(null, "Voce nao inseriu seu nome.");
        repeticao = true;
        } else { repeticao = false;
        }

        qlcoisa.setcpf(JOptionPane.showInputDialog(null,"Informe o cpf","Cadastro de Cliente",3));
        if(qlcoisa.getcpf().equals(null)) {
        	JOptionPane.showMessageDialog(null, "Voce nao inseriu seu cpf.");
        repeticao = true;
        } else {  repeticao = false;
        }
        
        qlcoisa.setcep(JOptionPane.showInputDialog(null,"Informe o seu  cep","Cadastro de Cliente",3));
        if(qlcoisa.getcep().equals(null)) {
        	JOptionPane.showMessageDialog(null, "Voce nao inseriu seu cep.");
        repeticao = true;
        
        } else {  repeticao = false;
        }

        JOptionPane.showMessageDialog(null,"\n Dados: \n" + "Nome: "
            + qlcoisa.getNome() + "\nIdade:" + qlcoisa.getcpf()+ " \n Cep:"+ qlcoisa.getcep());

        repetidor = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Deseja realizar uma nova operacao? \nDigite 1 para SIM e 2 para NAO.", 2));


         try{ if(repetidor == 1){
                JOptionPane.showMessageDialog(null, "Voce optou por realizar uma nova operacao. \n:)");
                repeticao = true;
            } else if(repetidor == 2) {
                JOptionPane.showMessageDialog(null, "Voce optou por sair. Obrigado por usar nosso aplicativo.\n:)");
                System.exit(0);

            } else { 
                JOptionPane.showMessageDialog(null, "Informacao invalida. As opções são 1 e 2 apenas..");
                System.exit(0);
            }} 
            //} catch (Exception a) { JOptionPane.showMessageDialog(null, "Voce inseriuu um valor errado. \ntry again.\n:)"); 
             catch (NumberFormatException ab) { 
                    JOptionPane.showMessageDialog(null, "Voce inseriuu um valor errado. \ntry again.\n:)"); 
            } catch (ArrayIndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(null, "Voce inseriuu um valor errado. \ntry again.\n:)");
            } catch (NullPointerException ar) {
                JOptionPane.showMessageDialog(null, "Voce inseriuu um valor errado. \ntry again.\n:)");
            } catch (StringIndexOutOfBoundsException at) {
                JOptionPane.showMessageDialog(null, "Voce inseriuu um valor errado. \ntry again.\n:)");
            } catch (Throwable aw) {
                JOptionPane.showMessageDialog(null, "Voce inseriuu um valor errado. \ntry again.\n:)");
                aw.printStackTrace();
            }
        }     
    }

}
