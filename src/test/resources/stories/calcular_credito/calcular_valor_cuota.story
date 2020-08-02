Simular el valor de las cuotas en un banco

Narrative:
    Con el fin de obtener un crédito de vivienda
    Como usuario visitante
    Quiero ser capaz de simulador el valor de las cuotas un banco

Scenario: Mostrar resultado del Calculo de Cuota
Given Quiero simular el valor de las cuotas un banco
When Ingreso Valor del credito <valor_credito>
And Selecciona plazo ano para calculo de <prestamo_cuota> <plazo>
And Click Calcular cuota
Then Deberia verse el resultado del calculo <prestamo_cuota>
Examples:
|valor_credito|prestamo_cuota|plazo|
|15000000|cuota|15 Años|

Scenario: No Permitir letras ni caraceteres especiales en Valor del credito
Given Quiero simular el valor de las cuotas un banco
When Ingreso Valor del credito <valor_credito>
Then Valor del credito esta vacio
And Deberia verse el boton Calcular Cuotas <calcular_cuota_activo>
Examples:
|valor_credito|calcular_cuota_activo|
|dfer|false|
|*|false|

Scenario: Validar que el Valor del credito sean mayor o igual a $15,000,000
Given Quiero simular el valor de las cuotas un banco
When Ingreso Valor del credito <valor_credito>
Then Deberia ver mensaje de validación: 'El valor del crédito debe ser mayor o igual a $15,000,000.' en Valor del credito
And Deberia verse el boton Calcular Cuotas <calcular_cuota_activo>
Examples:
|valor_credito|calcular_cuota_activo|
|200|false|
|14999999|false|

Scenario: Validar que el Valor del credito sea obligatorio
Given Quiero simular el valor de las cuotas un banco
When Ingreso Valor del credito <valor_credito>
Then Deberia ver mensaje de validación: 'Por favor ingresar campo' en Valor del credito
And Deberia verse el boton Calcular Cuotas <calcular_cuota_activo>
Examples:
|valor_credito|calcular_cuota_activo|
||false|