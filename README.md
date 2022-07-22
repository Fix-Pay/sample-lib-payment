# sample-lib-payment

# Para importar a library em outro projeto
- Copiar o arquivo gerado em "fixpaysales/build/outputs/fixpaysales-release.aar" para o projeto desejado.
- Colar o arquivo .aar em na pasta app/libs
- importar o arquivo .aar em build.gradle (module) -> implementation(name: 'fixpaysales-release', ext: 'aar')
