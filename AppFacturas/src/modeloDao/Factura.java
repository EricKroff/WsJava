package modeloDao;

import java.util.Date;

public class Factura {

	private int folio;
	private String descripcion;
	private Date fecha;
	private Cliente cliente;
	private ItemFactura[] items;
	private int indiceItems;
	public static final int MAX_ITEMS = 12;
	private static int ultimoFolio;
	
	public Factura(String descripcion, Cliente cliente) {
		super();
		this.descripcion = descripcion;
		this.cliente = cliente;
		this.items = new ItemFactura[MAX_ITEMS];
		this.folio = ++ultimoFolio;
		this.fecha = new Date();
	}
	
	public int getFolio() {
		return folio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public ItemFactura[] getItems() {
		return items;
	}
	
	public void addItemFactura(ItemFactura item) {
		if (indiceItems < MAX_ITEMS) {
		this.items[indiceItems ++] = item;
		}
	}
	
	public float calcularTotal() {
		float total = 0.0f;
		for(ItemFactura item: this.items) {
			total += item.calcularImporte();
		}
		return total;
}}
