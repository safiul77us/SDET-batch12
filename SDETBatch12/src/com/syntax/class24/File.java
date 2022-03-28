package com.syntax.class24;

/*
Create a class File that will have the following behaviors:
open, edit, close.
Edit and close are implemented method while open is an abstract.
Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour:
Example: to open .java file we need notepad++ or sublime text,
to open .doc file we need Microsoft word to be installed etc
 */

public abstract class File {
    void edit(){System.out.println("Editing the file");}
    void close(){System.out.println("Closing the file");}
    abstract void open();
}

class JavaFile extends File{
    @Override
    void open(){System.out.println("Opening .java with notepadd++");}
}
class Wordfile extends File{
    @Override
    void open(){System.out.println("Use MS word");}
}
class PdfFile extends File{
    @Override
    void open(){System.out.println("use pdf reader");}
}