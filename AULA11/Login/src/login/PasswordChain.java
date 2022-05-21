/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

/**
 *
 * @author renner
 */
public abstract class PasswordChain {

    protected PasswordChain next;
    protected IDStagePassword identificadorStagePassword;
    protected String description;


    public PasswordChain(IDStagePassword id, String description) {
        this.identificadorStagePassword = id;
        this.description = description;
    }

    public void setNext(PasswordChain nextStage) {
        if (this.next == null) {
            this.next = nextStage;
        } else {
            this.next.setNext(nextStage);
        }
    }

    public abstract boolean isValidPassword(String password);

    public void verifyPassword(String password) throws Exception {
        System.out.println("Entrou na etapa " + this.identificadorStagePassword + ": " + description);
        if (isValidPassword(password)) {
            if (this.next != null) {
                this.next.verifyPassword(password);
            }
        } else {
            throw new Exception("Não foi atendido os requisitos da etapa "+ this.identificadorStagePassword + ": " + description);
        }
    }
}
