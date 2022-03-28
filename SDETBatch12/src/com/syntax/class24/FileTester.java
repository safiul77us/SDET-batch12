package com.syntax.class24;

public class FileTester {
    public static void main(String[] args) {
//        File javaFile = new JavaFile();
//        javaFile.open();
//        javaFile.edit();
//        javaFile.close();

        File [] files = { //methods array
                new JavaFile(),
                new Wordfile(),
                new PdfFile()
        };
        for (File f: files){
            f.open();
            f.edit();
            f.close();
        }
        System.out.println("------------");
        for(int i = 0; i < files.length; i++){
            files[i].open();
            files[i].edit();
            files[i].close();
        }

    }
}
