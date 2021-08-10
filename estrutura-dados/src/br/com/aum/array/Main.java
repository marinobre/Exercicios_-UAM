package br.com.aum;

public class App {
    public static void main(String[] args) throws Exception {
        String alunos[] = new String[25];
        for (int i = 0; i < alunos.length; i++) {
            alunos[i] = "Aluno " + i;
            System.out.println(alunos[i]);
        }
        // cadastro  novos alunos
        alunos[25]= "Aluno 25";
        alunos[26]= "Aluno 26";
        alunos[27]= "Aluno 27";
        alunos[28]= "Aluno 28";
        alunos[29]= "Aluno 29";
        
    }
}
