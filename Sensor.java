class Sensor{
  public static Sensor[] sensores = new Sensor[8];
  public int tamano = 8;
  public int posAnadir = 0;
  
  private String tipo;
  private double valor;

  public Sensor(){
    
  }
  public Sensor(String t, double v){
    this(t, v)
  }
  public Sensor(String t, double v){
    this.tipo = t;
    this.valor = v;
  }
  public void setTipo(String n){
  this.Tipo = n;
}
public String getTipo(){
  return this.Tipo;
}
public void setValor(double n){
  this.valor = n;
}
public double getValor(){
  return this.valor;
}
@Override
  public String toString(){
    return "el tipo de sensor es" tipo + "y su valor eso"+ valor;
  }
  public static String toStringSensores(){
    String base = "";
    for (int i = 0; i < sensores.length; i++){
      if (sensores[i] != null){
        base += "#"+ (i+1) + "." + sensores[i].toString();
      }
    }
    return base;
  }
  public static int cantidadSensores(){
    return posAnadir;
  }