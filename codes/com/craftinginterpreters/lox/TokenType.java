package codes.com.craftinginterpreters.lox;

public enum TokenType {
    // Single-character tokens.
    LEFT_PAREN, RIGHT_PAREN, LEFT_BRANCE,
    COMMA,DOT,MINUS,PLUS,SEMICOLON,SLASH,STAR,

    // One or two character tokens.
    BANG,BANG_EQUAL,
    EQUAL, EQUAL_EQUAL,
    GREATER,GRETAR_EQUAL,
    LESS, LESS_EQUAL,

    // Literals.
    IDENTIFIRE,STRING,NUMBER,

    // Keywords.
    AND, CLASS, ELSE, FALSE, FUN, FOR, IF, NIL, OR,
    PRINT, RETURN, SUPER, THIS, TRUE, VAR, WHILE,

    EOF
}
