# Demo1

- Um simples sistema que calcula a taxa de juros com o EndPoint chamado "/taxa-juros" mostrado no Swagger
- Ela traz somente a taxa de juros (Que está fixado como 0.01)

# Tecnologias usada
- springBoot
- Lombok
- Java 17
- hibernate
- Swagger


-----------------------------------------
Link da página
http://localhost:8082/swagger-ui/index.html


-----------------------------------------
Os dois sistemas como "Demo" e "Demo1" tem que está rodando simultaneamente, para que a aplicação e o cálculo traga a informação correta.

Exemplo de entrada
valorinicial=100
meses=5 
Resultado esperado: 105,10
