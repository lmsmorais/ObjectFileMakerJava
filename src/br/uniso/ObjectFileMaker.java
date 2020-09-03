package br.uniso;

import java.io.*;

public class ObjectFileMaker {
    public static void main(String[] args) {

        //criar novo arquivo
        File file = new File("arquivoObjetos.bin");

        //tratar exceções
        try {
            file.createNewFile();
            Student s1 = new Student();
            s1.setCurso("SISTINFO");
            s1.setNome("Luis");
            s1.setIdade(19);

            Student s2 = new Student();
            s2.setCurso("SISTINFO");
            s2.setNome("Fulano");
            s2.setIdade(21);

            //fluxo de saida, memoria > HD
            OutputStream os = new FileOutputStream(file);
            //fluxo de saida especial para gravar objetos
            ObjectOutputStream oos = new ObjectOutputStream(os);
            //escrever objetos no arquivo
            oos.writeObject(s1);
            oos.writeObject(s2);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
