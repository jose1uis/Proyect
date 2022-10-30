class Vehiculo{
  public static Vehiculo[] vehiculos = new Vehiculo[10];
  
  public int tamano; = 10;
  public int posAnadir = 0;
  
  private int modelo;
  private String marca;
  private double valorComercial;
  private String color;

  public Vehiculo(){
    
  }
  public Vehiculo(int mo, String ma, double va){
    this(mo, ma, va, "verde")
    
  }
  public Vehiculo(int mo, String ma, double va, String co){
    this.modelo = mo;
    this.marca = ma;
    this.valorComercial = va;
    this.color = co;
}

public void setModelo(int n){
  this.modelo = n;
}
public int getModelo(){
  return this.modelo;
}
public void setMarca(String n){
  this.marca = n;
}
public String getMarca(){
  return this.marca;
}
public void setValorComerialo(double n){
  this.valorComercial = n;
}
public double getValorComercialo(){
  return this.valorComercial;
}
public void setcolor(String n){
  this.valorComercial = n;
}
public String getcolor(){
  return this.valorComercial;
}
@Override
  public String toString(){
  return "el modelo del auto es" + modelo + "su marca es " + marca + "su valor comericial es" + valorComercial + "y es de color" + color;

  public static String toStringVehiculos(){
    String base = "";
    for (int i = 0; i < vehiculos.length; i++){
      if (vehiculos[i] != null){
        base += "#"+ (i+1) + "." + vehiculos[i].toString();
      }
    }
    return base;
  }
  public static int cantidadVehiculos(){
    return posAnadir;
  }