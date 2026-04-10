package ni.edu.models;

import java.util.Objects;

public class Producto {
    private String nombre_producto;
    private String codigo_producto;
    private double precio;
    private int stock;
    private String descripcion;

    public Producto() {
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getCodigo_producto() {
        return codigo_producto;
    }

    public void setCodigo_producto(String codigo_producto) {
        this.codigo_producto = codigo_producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Double.compare(precio, producto.precio) == 0 && stock == producto.stock && Objects.equals(nombre_producto, producto.nombre_producto) && Objects.equals(codigo_producto, producto.codigo_producto) && Objects.equals(descripcion, producto.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre_producto, codigo_producto, precio, stock, descripcion);
    }

    @Override
    public String toString() {
        return
                "Producto: " + nombre_producto + '\n' +
                "Código: " + codigo_producto + '\n' +
                "Precio: " + precio + "$" + '\n' +
                "Stock: " + stock + '\n' +
                "Descripción: " + descripcion;
    }
}
