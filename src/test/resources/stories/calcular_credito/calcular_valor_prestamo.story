Simular cuanto puede prestar un banco

Narrative:
    Con el fin de obtener un crédito de vivienda
    Como usuario visitante
    Quiero ser capaz de simulador cuánto me puede prestar un banco

Scenario: Mostrar resultado del Calculo de credito
Given Quiero simular cuanto me puede prestar un banco
When Ingreso campo Ingresos mensuales <ingregos_mensuales>
And Selecciona plazo ano para calculo de <prestamo_cuota> <plazo>
And Click Calcular credito
Then Deberia verse el resultado del calculo <prestamo_cuota>
Examples:
|ingregos_mensuales|prestamo_cuota|plazo|
|737717|prestamo|15 Años|

Scenario: No Permitir letras ni caraceteres especiales en Ingresos mensuales
Given Quiero simular cuanto me puede prestar un banco
When Ingreso campo Ingresos mensuales <ingregos_mensuales>
Then Ingresos mensuales esta vacio
And Deberia verse el boton Calcular Credito <calcular_activo>
Examples:
|ingregos_mensuales|calcular_activo|
|dfer|false|
|*|false|

Scenario: Validar que los Ingresos mensuales sean mayores o iguales a $737.717
Given Quiero simular cuanto me puede prestar un banco
When Ingreso campo Ingresos mensuales <ingregos_mensuales>
Then Deberia ver mensaje de validación: 'Los ingresos deben ser mayores o iguales a $737,717.' en Ingresos mensuales
And Deberia verse el boton Calcular Credito <calcular_activo>
Examples:
|ingregos_mensuales|calcular_activo|
|200|false|
|737716|false|

Scenario: Validar que Ingresos mensuales sea obligatorio
Given Quiero simular cuanto me puede prestar un banco
When Ingreso campo Ingresos mensuales <ingregos_mensuales>
Then Deberia ver mensaje de validación: 'Por favor ingresar campo' en Ingresos mensuales
And Deberia verse el boton Calcular Credito <calcular_activo>
Examples:
|ingregos_mensuales|calcular_activo|
||false|