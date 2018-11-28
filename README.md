# Coloring-of-vertices-Wesh-and-powell

O projeto se trata de um trabalho para a disciplina de algoritmos em grafos 
da graduação de Engenharia de Software

O problema:
Encontrar o número mínimo de cores necessárias para colorir um grafo,
levando em conta que nenhum vértice poderá ter ligações entre vértices
de mesma coloração.


A solução de implementação se baseou no algoritmo de coloração de vértices Wesh and powell.

O algoritmo consiste em um receber um grafo, adicionar os vértives e arestas relevantes
ao problema. 
Criar uma lista de vértices em ordem decrescente levando em conta o grau de cada vértice
do grafo.
Apartir dessa lista, colorir o vértice com a menor cor disponível ainda não utilizada
pelos vértices adjacentes ao vértice escolhido.
