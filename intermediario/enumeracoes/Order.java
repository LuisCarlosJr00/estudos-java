package Entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entidade.enums.OrderStatus;

public class Order {
	
	//ATRIBUTOS
	private Date moment;
	private OrderStatus status;
	
	//ATRIBUTO DO CLIENTE, INSTANCIAÇÃO;
	private Client client;
	
	//DATE FORMAT
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:SS");
	
	//LIST DE ORDEM DE PEDIDOS 
	private List <OrdemItem> items = new ArrayList<>();
	
	//CONSTRUTORES
	public Order () {
	}
	
	public Order (Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	
	//GETTERS E SETTERS
	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	public Client getClient() {
		return client;
	}
	
	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrdemItem> getList() {
		return items;
	}
	
	//ADICIOAR E REMOVER PRODUTOS DA LISTA
	public void addItem(OrdemItem item) {
		items.add(item);
	}
	
	public void removeItem(OrdemItem item) {
		items.remove(item);
	}
	
	public Double total() {
		double sum = 0.0;
		for (OrdemItem item : items) {
			sum += item.subTotal();
		}
		return sum;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order Status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(client +"\n");
		sb.append("Ordem Items: \n");
		for (OrdemItem item: items) {
			sb.append(item + "\n");
		}
		sb.append("Total price: ");
		sb.append( total());
		 return sb.toString();
	}

}
