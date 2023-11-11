# Algoritmos de Ordenação 
Trabalho da máteria de Estrutura de Dados, 4° perido do curso de Eng. de Software da PUCPR - , feito por Breno Rocha, Vittorio Caprioli. A implementação dos algoritmos de ordenação Bubble Sort, Insertion Sort, Quick Sort. Cada algoritmo oferece eficiência e complexidade diferentes.

## Bubble Sort
O Bubble Sort é um algoritmo de ordenação simples que percorre repetidamente a lista, compara elementos adjacentes e troca-os se necessário. A passagem pela lista é repetida até que a lista esteja ordenada. É algoritmo simples, mas é menos eficiente em listas grandes.

![Sorting_shaker_sort_anim](https://github.com/capriol1/AlgoritmoDeOrdenacao/assets/107329789/9ee9ece2-2d61-4f84-bf84-7fecc312b98a)

## Insertion Sort
O Insertion Sort é um algoritmo mais eficiente para conjuntos de dados mais pequenos. Itera consumindo um elemento de entrada a cada repetição e aumenta uma lista de saída classificada. A cada iteração, a ordenação por inserção remove um elemento dos dados de entrada, encontra o local ao qual pertence na lista ordenada e o insere lá.

![Insertion_sort_animation](https://github.com/capriol1/AlgoritmoDeOrdenacao/assets/107329789/35406b09-bc31-45f5-b8ad-1f9fcd19159a)


## Quick Sort
O Quick Sort é um algoritmo de ordenação altamente eficiente e baseia-se no princípio dividir para conquistar. Divide a lista em partes mais pequenas com base num elemento pivot e, em seguida, ordena recursivamente as sub-listas. É adequado para grandes conjuntos de dados.

![download](https://github.com/capriol1/AlgoritmoDeOrdenacao/assets/107329789/61a45a6c-80e5-4664-a3d2-c441f7380ae2)

## Implementação 

### Implementação Bubble Sort
  
Ele compara pares de elementos adjacentes e os troca se estiverem na ordem errada. Esse processo é repetido até que o array esteja ordenado. A cada passagem completa pelo array, o maior elemento troca até sua posição correta no final do array. O método printArray é chamado após cada troca para mostrar o progresso da ordenação.

### Implementação Insertion Sort

 Ele funciona pegando um elemento (key) e inserindo-o na posição correta na parte ordenada do array. Isso é feito movendo para frente os elementos maiores do que key. O método printArray é chamado após cada inserção para mostrar o progresso da ordenação.

### Implementação Quick Sort 

Ele particiona o array em dois segmentos com base em um pivô, colocando todos os elementos menores que o pivô à sua esquerda e os maiores à direita. Este processo é repetido recursivamente para cada subseção do array até que esteja totalmente ordenado. O método printArray é chamado para exibir o estado atual do array após cada troca significativa
