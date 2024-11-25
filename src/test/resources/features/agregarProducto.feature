#language: es

Característica: Automatizacion TiendasJumbo E-commerce

  @regresion

  Escenario: Agregar un producto al carrito de compras

    Dado el usuario esta en la pagina principal de Tiendas Jumbo
    Cuando selecciona una categoria y un producto
    Y lo agrega al carrito de compras
    Y ingresa su correo electronico para asociar la compra
    Cuando selecciona el método de entrega y completa el formulario
    Entonces el proceso de agregar al carrito se completa correctamente
