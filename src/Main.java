//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    MembresiaGimnasio socio = new MembresiaGimnasio(
            "12345678",
            "Juan Perez"
    );

    System.out.println("Estado inicial:");
    socio.mostrarInformacion();

    System.out.println();

    socio.pagarCuota();

    System.out.println("Estado después de pagar:");
    socio.mostrarInformacion();
}
