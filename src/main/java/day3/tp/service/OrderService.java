package day3.tp.service;

import day3.tp.domain.Event;
import day3.tp.domain.Guest;
import day3.tp.domain.Order;

public interface OrderService {

    Order signUp(Event event, Guest guest);
}
