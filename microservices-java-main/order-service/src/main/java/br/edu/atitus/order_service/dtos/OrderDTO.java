package order;

import java.util.List;

public record OrderDTO(List<OrderItemDTO> items) {}
