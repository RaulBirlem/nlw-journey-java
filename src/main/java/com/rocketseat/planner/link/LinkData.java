package com.rocketseat.planner.link;

import java.util.UUID;

//Record para transferência de dados
public record LinkData(UUID id, String title, String url) {
}
