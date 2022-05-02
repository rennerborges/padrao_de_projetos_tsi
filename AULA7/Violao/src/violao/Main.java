/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package violao;

import java.util.Scanner;

/**
 *
 * @author renner
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        ViolaoPrototype violaoClassico = new Violao(300, "Violão Classico", "Acústico", "O violão clássico é um modelo acústico e funciona com seis cordas (na maioria das vezes, feitas de nylon).\n"
                + "Além da facilidade em encontrar esse modelo, ele possui um custo mais baixo quando comparado aos outros tipos, e também é indicado\n"
                + "para iniciantes graças à sua leveza e maciez.", "Nylon", 6); 
        
        System.out.println("--------- Modelos ---------\nClássico \nFolk\nFlet\nJumbo\n7Cordas\n12Cordas\nParlor\n\n");
        
        System.out.println("Informe o modelo desejado de violão:");
        String tipo = scan.nextLine().toLowerCase();
        
        switch (tipo) {
            case "classico":
                System.out.println(violaoClassico.exibirInfo());
                break;
            case "folk": 
                ViolaoPrototype violaoFolk = violaoClassico.clonar();
        
                violaoFolk.setAllAttributes(599.99, "Violão Folk", "Elétricos ou eletroacústicos", "Com o corpo maior e mais “acinturado”, os violões do tipo folk também são bastante populares entre os músicos. \n"
                        + "A maioria dos modelos desse tipo de violão funciona com a utilização de cordas de aço, podendo ser elétricos ou eletroacústicos.\n"
                        + "Esse tipo de violão é o mais indicado para gêneros como pop e rock, já que gera um som mais encorpado, com timbre diferenciado.", "Aço", 6);
                System.out.println(violaoFolk.exibirInfo());
                break;
            case "flet":
                ViolaoPrototype violaoFlet = violaoClassico.clonar();
        
                violaoFlet.setAllAttributes(599.99, "Violão Flet", "Elétricos", "A palavra flat, do inglês, pode significar “plano” ou “liso”. É justamente essa a principal\n"
                        + "característica desse tipo de violão: sua caixa acústica é bastante fina!\n"
                        + "O violão flet é muito utilizado por músicos profissionais e na maioria dos casos é tocado com cordas de nylon.\n"
                        + "O timbre gerado por esse tipo de violão é mais suave. Vale lembrar que, por ser encontrado quase sempre em modelos elétricos,\n"
                        + "precisa de amplificação.", "Nylon", 6);
                
                System.out.println(violaoFlet.exibirInfo());
                break;
            case "jumbo":
                ViolaoPrototype violaoJumbo = violaoClassico.clonar();
        
                violaoJumbo.setAllAttributes(799.00, "Violão Jumbo", "Eletroacústico", "O violão jumbo ficou famoso nas mãos de Elvis Presley, mas, apesar de ser bem parecido com o tipo clássico,\n"
                        + "a grande diferença está em seu corpo mais largo e na base mais arredondada.\n"
                        + "É mais fácil de encontrar modelos eletroacústicos e com cordas de aço. O som gerado pelo violão jumbo é mais grave e encorpado.", "Aço", 6);
                System.out.println(violaoJumbo.exibirInfo());
                break;
            case "7cordas":
                ViolaoPrototype violao7Cordas = violaoClassico.clonar();

        
                violao7Cordas.setAllAttributes(899.99, "Violão 7 cordas", "Acústico e eletroacústico", "Conhecido como o violão brasileiro, já que é indicado para acompanhar gêneros como o choro e o samba,\n"
                        + "esse tipo de violão não apresenta diferenças na sua estrutura quando comparado ao violão clássico.\n"
                        + "Porém seu diferencial está na sétima corda, que costuma ser afinada de maneira mais grave que as outras seis.\n"
                        + "Isso exige um conhecimento do músico que for tocá-lo.", "Nylon ou aço", 7);
                System.out.println(violao7Cordas.exibirInfo());
                break;
            case "12cordas":
                ViolaoPrototype violao12Cordas = violaoClassico.clonar();
        
                violao12Cordas.setAllAttributes(1200.99, "Violão 12 cordas", "Eletroacústico", "Outro tipo de violão que também não apresenta diferenças na estrutura, o violão 12 cordas traz o dobro de cordas do que o clássico.\n"
                        + "Essas são agrupadas em duplas (metade delas afinadas com uma oitava acima).\n"
                        + "Esse tipo apresenta ressonância plena e exige técnica e prática para poder pressionar duas cordas simultaneamente.", "Aço", 12);
                System.out.println(violao12Cordas.exibirInfo());
                break;
            case "parlor":
                ViolaoPrototype violaoParlor = violaoClassico.clonar();
        
                violaoParlor.setAllAttributes(4500, "Violões Zero, Duplo Zero e Triplo Zero", "Eletroacústico", "Esses tipos de violões são categorizados como Parlor, com estruturas menores e sendo mais indicado para uso casual e não tanto profissional.\n"
                        + "Entre os três tipos, o violão zero é o menor, com uma estrutura confortável para tocar por bastante tempo. Já o duplo zero é um pouco maior, apresentando uma boa sonoridade e sendo indicado para técnicas de fingerstyle.\n"
                        + "O triplo zero possui tamanho intermediário e gera um timbre mais peculiar.", "Aço", 6);
                System.out.println(violaoParlor.exibirInfo());
                break; 
            default:
                throw new AssertionError();
        }

    }
    
}
