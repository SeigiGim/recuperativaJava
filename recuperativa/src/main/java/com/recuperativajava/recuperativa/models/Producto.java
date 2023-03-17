package com.recuperativajava.recuperativa.models;

public class Producto extends TipoProducto {
  public String nombreProducto;
  public Double precioVenta;
  public Integer cantidad;

  public Producto() {
    super();
  }

  public Producto(String categoria, String nombreProducto, Double precioVenta, Integer cantidad) {
    super(categoria);
    this.nombreProducto = nombreProducto;
    this.precioVenta = precioVenta;
    this.cantidad = cantidad;
  }

  public String getNombreProducto() {
    return nombreProducto;
  }

  public void setNombreProducto(String nombreProducto) {
    this.nombreProducto = nombreProducto;
  }

  public Double getPrecioVenta() {
    return precioVenta;
  }

  public void setPrecioVenta(Double precioVenta) {
    this.precioVenta = precioVenta;
  }

  public Integer getCantidad() {
    return cantidad;
  }

  public void setCantidad(Integer cantidad) {
    this.cantidad = cantidad;
  }

  @Override
  public String toString() {
    return "Producto [nombreProducto=" + nombreProducto + ", precioVenta=" + precioVenta + ", cantidad=" + cantidad
        + "]";
  }

}
