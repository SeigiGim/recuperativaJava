package com.recuperativajava.recuperativa.models;

import java.util.ArrayList;

public class Inventario {
  public ArrayList<Producto> productosEnInventario = new ArrayList<Producto>();

  public Inventario() {
  }

  public Inventario(ArrayList<Producto> productosEnInventario) {
    this.productosEnInventario = productosEnInventario;
  }

  public ArrayList<Producto> getProductosEnInventario() {
    return productosEnInventario;
  }

  public void setProductosEnInventario(ArrayList<Producto> productosEnInventario) {
    this.productosEnInventario = productosEnInventario;
  }

  @Override
  public String toString() {
    return "Inventario [productosEnInventario=" + productosEnInventario + "]";
  }

}
