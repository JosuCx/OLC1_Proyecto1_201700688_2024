/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;

/**
 *
 * @author jacux
 */
public class Token {
    //atributos del objeto 
    private String lexema;
    private String type;
    private int row;
    private int column;
    //Contrusctor
    public Token(String lexema,String type, int row, int column){
        this.lexema=lexema;
        this.type=type;
        this.column=column;
        this.row=row;
    }
    //Gets y setters
    public void setLexema(String lexema){
        this.lexema=lexema;
    }
    public String getLexema(){
        return lexema;
    }
    public void setType(String type){
        this.type=type;
    }
    public String getType(){
        return type;
    }
    public void setColumn(int column){
        this.column=column;
    }
    public int getColumn(){
        return column;
    }
    public void setRow(int row){
        this.row=row;
    }
    public int getRow(){
        return row;
    }
     @Override
    public String toString() {
        return "Token{" +
                "lexema='" + lexema + '\'' +
                ", tipo='" + type + '\'' +
                ", linea=" + row +
                ", columna=" + column +
                '}';
    }
}
