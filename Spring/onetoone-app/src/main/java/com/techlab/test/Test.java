package com.techlab.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techlab.entity.Cart;
import com.techlab.entity.Item;

public class Test {
	public static void main(String[] args) {
		Configuration config = new Configuration();
		SessionFactory fact = config.configure("hibernate.cfg.xml").buildSessionFactory();

		Cart cart1 = new Cart();
		cart1.setId(1);
		cart1.setQuantity(2);
		Cart cart2 = new Cart();
		cart2.setId(2);
		cart2.setQuantity(4);

		Item item1 = new Item();
		item1.setId(1);
		item1.setName("book");
		item1.setPrice(200);
		Item item2 = new Item();
		item2.setId(2);
		item2.setName("pen");
		item2.setPrice(13);

		cart1.setItem(item1);
		cart2.setItem(item2);

		Session session = fact.openSession();
		Transaction transaction = session.beginTransaction();
		// session.save(cart1);
		// session.save(cart2);
		printAll(session);
		transaction.commit();
		session.close();
	}

	private static void printAll(Session session) {
		List<Cart> carts = session.createQuery("from Cart").list();
		for (Cart cart : carts) {
			System.out.println("cartId:" + cart.getId() + "\tquantity:" + cart.getQuantity() + "\ncartItem:"
					+ cart.getItem().getName() + "\titemPrice:" + cart.getItem().getPrice() + "\ttotalprice:"
					+ (cart.getQuantity() * cart.getItem().getPrice()));
		}
	}
}
