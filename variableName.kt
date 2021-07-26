fun variableName(name: String): Boolean {
    return name.matches( Regex("[a-zA-Z_][a-zA-Z0-9_]*"))
}