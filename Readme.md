# Diagrama de classe Iphone
#### com base no desafio solicitado e usando os conhecimentos aprendidos no curso
#### para criar de forma simples utilizei o Visual Code Studio como editor

#### ------------------------------------------------------------
#### |              iPhone                                      |
#### ------------------------------------------------------------
#### | - modelo: String                                         |
#### | - armazenamento: int                                     |
#### ------------------------------------------------------------
#### | + ligar(): void                                          |
#### | + desligar(): void                                       |
#### | + fazerChamada(numero: String): void                     |
#### | + receberChamada(): void                                 |
#### | + enviarMensagem(numero: String, mensagem: String): void |
#### | + reproduzirMusica(): void                               |
#### | + pausarMusica(): void                                   |
#### | + abrirNavegador(): void                                 |
#### | - armazenarDados(): void                                 |
#### ------------------------------------------------------------

#### ------------------------------------------------------------
#### |        ReprodutorMusical                                 |
#### ------------------------------------------------------------
#### | + reproduzir(): void                                     |
#### | + pausar(): void                                         |
#### | + avancar(): void                                        |
#### | + retroceder(): void                                     |
#### ------------------------------------------------------------

#### ------------------------------------------------------------
#### |       AparelhoTelefonico                                 |
#### ------------------------------------------------------------
#### | + fazerChamada(): void                                   |
#### | + receberChamada(): void                                 |
#### | + enviarMensagem(): void                                 |
#### ------------------------------------------------------------

#### ------------------------------------------------------------
#### |       NavegadorInternet                                  |
#### ------------------------------------------------------------
#### | + abrirPagina(url: String): void                         |
#### | + fecharPagina(): void                                   |
#### | + navegarHistorico(): void                               |
#### ------------------------------------------------------------
