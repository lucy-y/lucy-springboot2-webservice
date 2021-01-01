package com.lucy.study.springboot.web.dto;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ItemDtoTest {

    @Test
    public void lombok_test() {
        String name = "A";
        int amount = 100;

        ItemDto item = new ItemDto(name, amount);

        assertThat(item.getName()).isEqualTo(name);
        assertThat(item.getAmount()).isEqualTo(amount);
    }
}
