package com.recuperativajava.recuperativa.models;

public class TipoProducto {
  public String categoria;

  public TipoProducto() {
  }

  public TipoProducto(String categoria) {
    this.categoria = categoria;
  }

  public String getCategoria() {
    return categoria;
  }

  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

  @Override
  public String toString() {
    return "TipoProducto [categoria=" + categoria + "]";
  }

}
