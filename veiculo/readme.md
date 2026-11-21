**Hierarquia de Classes para Veículos**

Para ilustrar o poder da herança, estenderemos uma classe denominada *Vehicle*. A classe *Vehicle* encapsula informações sobre veículos, inclusive o número de passageiros que eles podem levar, sua capacidade de armazenamento de combustível e sua taxa de consumo de combustível. Podemos usar a classe *Vehicle* como ponto de partida a partir do qual classes mais especializadas serão desenvolvidas. Por exemplo, um caminhão ***é um*** tipo de veículo. Um atributo importante de um caminhão é sua capacidade de transportar carga. Logo, para criar uma classe *Truck*, podemos estender *Vehicle*, adicionando uma variável de instância que armazene a capacidade de transporte de carga. No processo, as variáveis de instância de *Vehicle* (e demais subclasses) serão tornadas *private* e métodos de acesso/modificação (*get…/set…*) serão fornecidos para a verificação e a configuração de seus valores.

Passo a passo do Exercício:

1\. Crie a classe ***Vehicle*** \- com atributos privados (*passengers*, *fuelCap* e *mpg* \- milhas por galão) e métodos *get* e *set* adequados. Crie pelo menos um construtor para *Vehicle*.

2\. Com base em *Vehicle*, crie uma classe *Truck* estendendo a classe base (*Vehicle*). ***Truck*** possui pelo menos um atributo adicional (*cargoCap*) em relação à classe *Vehicle*. Crie pelo menos um construtor para ***Truck*** \- fazendo a devida chamada (explícita) ao construtor de *Vehicle*.

3\. Muitos outros tipos de classes podem ser derivados de *Vehicle*. Por exemplo, podemos criar uma classe ***Off-Road*** que possui a distância entre o veículo e o solo (*groundClearance*) como atributo adicional em comparação à *Vehicle* (além de métodos correlatos). Defina a classe ***Off-Road***, incluindo construtor(es) para a mesma.

4\. Crie um programa (*public static void main (String\[\] args)*) que testa a hierarquia de classes construída.

Obs.: aspectos adicionais podem ser incluídos na implementação como métodos "*public String toString()*" para cada classe.

O ponto-chave do uso de Herança é que quando você tiver criado uma superclasse que defina os aspectos gerais de uma classe de objetos, esta poderá ser herdada para formar classes especializadas. Cada subclasse adiciona apenas seus atributos e comportamentos exclusivos. Essa é a essência da herança.  
