programa {
  funcao inicio() {
    inteiro vetor[10]
    inteiro i, soma = 0
    real media

    para (i = 0; i < 10; i++) {
      escreva("Digite o ", i+1, "º número: ")
      leia(vetor[i])
      soma = soma + vetor[i] 
    }

    escreva("\nElementos nos índices ímpares: \n")
    para (i = 1; i < 10; i = i + 2) {
      escreva(vetor[i], " ")
    }

    escreva("\nElementos pares: \n")
    para (i = 0; i < 10; i++) {
      se (vetor[i] % 2 == 0) { 
        escreva(vetor[i], " ")
      }
    }
    media = soma / 10 
    
    escreva("\nSoma: ", soma)
    escreva("\nMédia: ", media) 
  }
}
