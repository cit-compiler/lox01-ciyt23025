package com.craftinginterpreters.lox;

import java.util.HashMap;
import java.util.Map;

class Environment {
  private final Map<String, Object> values = new HashMap<>();

  // 変数の定義 (var a = 1;)
  void define(String name, Object value) {
    values.put(name, value);
  }

  // 変数の値を取得 (print a;)
  Object get(Token name) {
    if (values.containsKey(name.lexeme)) {
      return values.get(name.lexeme);
    }

    throw new RuntimeError(name, "Undefined variable '" + name.lexeme + "'.");
  }
}