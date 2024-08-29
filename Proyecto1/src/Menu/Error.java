/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;

/**
 *
 * @author jacux
 */
public class Error {
    private String description;
    private String type;
    private int row;
    private int column;
    //Constructor
    public Error(String type,String description, int row, int column){
        this.description=description;
        this.type=type;
        this.column=column;
        this.row=row;
    }
    //Gets y setters
    public void setDescription(String description){
        this.description=description;
    }
    public String getDescription(){
        return description;
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
                "Descripcion='" + description + '\'' +
                ", tipo='" + type + '\'' +
                ", linea=" + row +
                ", columna=" + column +
                '}';
    }
}
