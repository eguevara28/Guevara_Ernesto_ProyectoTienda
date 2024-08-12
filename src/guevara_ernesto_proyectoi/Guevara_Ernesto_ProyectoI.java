/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guevara_ernesto_proyectoi;

import java.util.Scanner;

/**
 *
 * @author Ernesto
 */
public class Guevara_Ernesto_ProyectoI {

    public static void main(String[] args) {

        Scanner lea = new Scanner(System.in);

        int dia = 1, azucar = 0, maiz = 0, avena = 0, trigo = 0, azucarvendido = 0, maizvendido = 0, avenavendida = 0, trigovendido = 0, compras = 0, ventas = 0, llave = 0;
        double caja = 0, dinerorecaudado = 0, dinerogastado = 0, masganancia = 0, masgasto = 0, banco = 0;
        String listamasganancia = "", listamasgasto = "";

        while (true) {
            System.out.println("*** BIENVENIDO A LA TIENDA ***");
            System.out.println("Dia: " + dia);
            System.out.println("Seleccione una opcion:");
            System.out.println("1) Abrir Caja");
            System.out.println("2) Salir del Sistema");
            int op=0;
            try{
            op = lea.nextInt();
            }catch(Exception e){
                System.out.println("En este campo solo se debe ingresar numeros");
                lea.nextLine();
            }
            if (op == 1) {
                if (caja == 0) {
                    while (true) {
                        System.out.println("*** Bienvenido a la Caja ***");
                        System.out.println("Cantidas de Efectivo en Caja actualmente: " + caja);
                        System.out.println("Cuanto desea añadir a Caja? :");
                        double añadir = 0;
                        try {
                            añadir = lea.nextDouble();
                        } catch (Exception e) {
                            System.out.println("Solo se pueden ingresar numeros en este campo");
                            lea.nextLine();
                        }
                        if (añadir > 0) {
                            caja += añadir;
                            System.out.println("La nueva cantidad de Efectivo en Caja es: " + caja);
                            break;
                        } else {
                            System.out.println("No se puede añadir montos negativos");
                        }
                    }
                }

                if (caja > 0) {
                    do {
                        System.out.println("*** BIENVENIDO A LA TIENDA ***");
                        System.out.println("Dia: " + dia);
                        System.out.println("Seleccione una opcion:");
                        System.out.println("1) Abrir Caja");
                        System.out.println("2) Vender");
                        System.out.println("3) Comprar");
                        System.out.println("4) Reportes");
                        System.out.println("5) Cerrar Caja");
                        System.out.println("6) Salir del Sistem");
                        int op2 = 0;
                        try {
                            op2 = lea.nextInt();
                        } catch (Exception e) {
                            System.out.println("En este campo solo se deben ingresar numeros");
                            lea.nextLine();
                        }
                        if (op2 == 1) {
                            while (true) {
                                System.out.println("*** Bienvenido a la Caja ***");
                                System.out.println("Cantidas de Efectivo en Caja actualmente: " + caja);
                                System.out.println("Cuanto desea añadir a Caja? :");
                                double añadir = 0;
                                try {
                                    añadir = lea.nextDouble();
                                } catch (Exception e) {
                                    System.out.println("En este campo solo se pueden ingresar numeros");
                                    lea.nextLine();
                                }
                                if (añadir > 0) {
                                    caja += añadir;
                                    System.out.println("La nueva cantidad de Efectivo en Caja es: " + caja);
                                    break;
                                } else {
                                    System.out.println("No se puede ingresar montos negativos");
                                }
                            }
                        }

                        if (op2 == 2) {
                            while (true) {
                                if (maiz == 0 && azucar == 0 && trigo == 0 && avena == 0) {
                                    System.out.println("No hay productos en el inventario para vender");
                                    break;
                                }
                                String lista = "", producto;
                                double subtotal = 0;
                                int kg = 0, precioventa;

                                System.out.println("Que tipo de cliente es usted?: ");
                                char tipocliente = lea.next().toUpperCase().charAt(0);

                                if (tipocliente != 'A' && tipocliente != 'B' && tipocliente != 'C') {
                                    System.out.println("Este Tipo de Cliente No Existe");
                                }

                                if (tipocliente == 'A') {
                                    while (true) {
                                        System.out.println("----------------------------------------");
                                        System.out.println("Codigo      Producto      Precio / Kg     Unidades Disponibles");
                                        System.out.println("1           Azucar        Lps. 30                " + azucar);
                                        System.out.println("2           Avena         Lps. 25                " + avena);
                                        System.out.println("3           Trigo         Lps. 32                " + trigo);
                                        System.out.println("4           Maiz          Lps. 20                " + maiz);
                                        System.out.println("----------------------------------------");
                                        System.out.println("Para salir escriba 5");
                                        System.out.println("Ingrese el codigo del producto que desea?: ");
                                        int codigop = 0;

                                        try {
                                            codigop = lea.nextInt();
                                        } catch (Exception e) {
                                            System.out.println("En este campo solo se pueden ingresar numeros");
                                            lea.nextLine();
                                        }

                                        if (codigop == 5) {
                                            break;
                                        }

                                        producto = (codigop == 1) ? "Azucar"
                                                : (codigop == 2) ? "Avena"
                                                        : (codigop == 3) ? "Trigo"
                                                                : (codigop == 4) ? "Maiz" : "No Existe";

                                        precioventa = (producto.equals("Azucar")) ? 30
                                                : (producto.equals("Avena")) ? 25
                                                : (producto.equals("Trigo")) ? 32
                                                : (producto.equals("Maiz")) ? 20 : 0;

                                        if (codigop == 1 || codigop == 2 || codigop == 3 || codigop == 4) {
                                            System.out.println("Cuantos kilogramos de este producto desea?: ");
                                            kg = lea.nextInt();
                                            if (kg > 0) {
                                                if (codigop == 1 && azucar >= kg || codigop == 2 && avena >= kg || codigop == 3 && trigo >= kg || codigop == 4 && maiz >= kg) {

                                                    ventas++;

                                                    if (producto.equals("Azucar")) {
                                                        azucar -= kg;
                                                        azucarvendido += kg;
                                                    }

                                                    if (producto.equals("Avena")) {
                                                        avena -= kg;
                                                        avenavendida += kg;
                                                    }

                                                    if (producto.equals("Trigo")) {
                                                        trigo -= kg;
                                                        trigovendido += kg;
                                                    }

                                                    if (producto.equals("Maiz")) {
                                                        maiz -= kg;
                                                        maizvendido += kg;
                                                    }

                                                    double pago = kg * precioventa;
                                                    subtotal += pago;
                                                    lista += "Producto: " + producto + "\nCantidad (kg): " + kg + "\nPrecio por kilogramo: " + precioventa + "\n";

                                                    System.out.println("Desea comprar otro producto? (s/n)");
                                                    char otro = lea.next().toUpperCase().charAt(0);

                                                    if (otro == 'N') {
                                                        System.out.println("-------------------------------------------------");
                                                        System.out.println("Compras arriba de 1000 reciben 5% de descuento");
                                                        System.out.println("Compras arriba de 5000 reciben 10% de descuento");
                                                        System.out.println("-------------------------------------------------");
                                                        double porcentajedescuento = 0;
                                                        int displaydescuento = 0;

                                                        if (subtotal > 1000) {
                                                            porcentajedescuento = 0.05;
                                                            displaydescuento = 5;
                                                        } else if (subtotal > 5000) {
                                                            porcentajedescuento = 0.1;
                                                            displaydescuento = 10;
                                                        }

                                                        double descuento = subtotal * porcentajedescuento;
                                                        double impuesto = subtotal * 0.07;
                                                        double total = subtotal + impuesto - porcentajedescuento;

                                                        System.out.println("****************** FACTURA ******************");
                                                        System.out.println(lista);
                                                        System.out.println("Subtotal: " + subtotal);
                                                        System.out.print("Impuestos (7%) : ");
                                                        System.out.println(String.format("%.2f", impuesto));
                                                        System.out.println("Tienes un descuento de " + displaydescuento + "% :" + descuento);
                                                        System.out.println("El total a pagar es de: " + total);
                                                        System.out.println("*******************************************\n");
                                                        dinerorecaudado += total;
                                                        caja += total;
                                                        if (total > masganancia) {
                                                            masganancia = total;
                                                            listamasganancia = lista;
                                                        }
                                                        break;
                                                    }
                                                } else {
                                                    System.out.println("Lo sentimos no tenemos suficiente inventario de este producto");
                                                    break;
                                                }
                                            } else {
                                                System.out.println("No se aceptan numeros negativos");
                                            }
                                        }
                                    }
                                } else if (tipocliente == 'B') {
                                    while (true) {
                                        System.out.println("---------------------------------------------------------------");
                                        System.out.println("Codigo      Producto      Precio / Kg    Unidades Disponibles");
                                        System.out.println("1           Azucar        Lps. 30             " + azucar);
                                        System.out.println("2           Avena         Lps. 25             " + avena);
                                        System.out.println("3           Trigo         Lps. 32             " + trigo);
                                        System.out.println("----------------------------------------------------------------");
                                        System.out.println("Escriba 5 para salir");
                                        System.out.println("Ingrese el codigo del producto que desea?: ");
                                        int codigop = lea.nextInt();

                                        if (codigop == 5) {
                                            break;
                                        }

                                        if (codigop == 4) {
                                            System.out.println("No puedes comprar este producto");
                                        }

                                        if (codigop != 1 && codigop != 2 && codigop != 3 && codigop != 4) {
                                            System.out.println("Este producto no existe");
                                        }

                                        producto = (codigop == 1) ? "Azucar"
                                                : (codigop == 2) ? "Avena"
                                                        : (codigop == 3) ? "Trigo" : "No Existe";

                                        precioventa = (producto.equals("Azucar")) ? 30
                                                : (producto.equals("Avena")) ? 25
                                                : (producto.equals("Trigo")) ? 32 : 0;

                                        if (codigop == 1 || codigop == 2 || codigop == 3) {
                                            System.out.println("Cuantos kilogramos de este producto desea?: ");
                                            kg = lea.nextInt();
                                            if (kg > 0) {
                                                if (codigop == 1 && azucar >= kg || codigop == 2 && avena >= kg || codigop == 3 && trigo >= kg) {
                                                    ventas++;

                                                    if (producto.equals("Azucar")) {
                                                        azucarvendido += kg;
                                                        azucar -= kg;
                                                    } else if (producto.equals("Avena")) {
                                                        avenavendida += kg;
                                                        avena -= kg;
                                                    } else if (producto.equals("Trigo")) {
                                                        trigovendido += kg;
                                                        trigo -= kg;
                                                    }

                                                    double pago = kg * precioventa;
                                                    subtotal += pago;
                                                    lista += "Producto: " + producto + "\nCantidad (kg): " + kg + "\nPrecio por kilogramo: " + precioventa + "\n";

                                                    System.out.println("Desea comprar otro producto? (s/n): ");
                                                    char otro = lea.next().toUpperCase().charAt(0);

                                                    if (otro == 'N') {
                                                        System.out.println("-------------------------------------------------");
                                                        System.out.println("Compras arriba de 1000 reciben 5% de descuento");
                                                        System.out.println("Compras arriba de 5000 reciben 10% de descuento");
                                                        System.out.println("-------------------------------------------------");
                                                        double porcentajedescuento = 0;
                                                        int displaydescuento = 0;

                                                        if (subtotal > 1000) {
                                                            porcentajedescuento = 0.05;
                                                            displaydescuento = 5;
                                                        } else if (subtotal > 5000) {
                                                            porcentajedescuento = 0.1;
                                                            displaydescuento = 10;
                                                        }

                                                        double descuento = subtotal * porcentajedescuento;
                                                        double impuesto = subtotal * 0.07;
                                                        double total = subtotal + impuesto - porcentajedescuento;

                                                        System.out.println("****************** FACTURA ******************");
                                                        System.out.println(lista);
                                                        System.out.println("Subtotal: " + subtotal);
                                                        System.out.print("Impuestos (7%) : ");
                                                        System.out.println(String.format("%.2f", impuesto));
                                                        System.out.println("Tienes un descuento de " + displaydescuento + "% :" + descuento);
                                                        System.out.println("El total a pagar es de: " + total);
                                                        System.out.println("*******************************************\n");
                                                        caja += total;
                                                        dinerorecaudado += total;
                                                        if (total > masganancia) {
                                                            masganancia = total;
                                                            listamasganancia = lista;
                                                        }
                                                        break;
                                                    }
                                                } else {
                                                    System.out.println("No tenemos invetario de este producto");
                                                    break;
                                                }
                                            } else {
                                                System.out.println("No se pueden ingresar numeros negativos");
                                            }
                                        }
                                    }
                                } else if (tipocliente == 'C') {
                                    while (true) {
                                        System.out.println("----------------------------------------------------------------");
                                        System.out.println("Codigo      Producto      Precio / Kg     Unidades Disponibles");
                                        System.out.println("4           Maiz          Lps. 20                " + maiz);
                                        System.out.println("----------------------------------------------------------------");
                                        System.out.println("Escriba 5 para salir");
                                        System.out.println("Ingrese el codigo del producto que desea?: ");
                                        int codigop = lea.nextInt();

                                        if (codigop == 5) {
                                            break;
                                        }

                                        if (codigop == 1 || codigop == 2 || codigop == 3) {
                                            System.out.println("No puedes comprar este producto");
                                        }

                                        if (codigop != 1 && codigop != 2 && codigop != 3 && codigop != 4) {
                                            System.out.println("Este producto no existe");
                                        }

                                        producto = (codigop == 4) ? "Maiz" : "No Existe";
                                        precioventa = (producto.equals("Maiz")) ? 20 : 0;

                                        if (codigop == 1 || codigop == 2 || codigop == 3) {
                                            System.out.println("No puedes comprar este producto");
                                        }
                                        if (codigop != 1 && codigop != 2 && codigop != 3 && codigop != 4) {
                                            System.out.println("Este producto no existe");
                                        }

                                        if (codigop == 4) {
                                            System.out.println("Cuantos kilogramos de este producto desea?: ");
                                            kg = lea.nextInt();
                                            if (kg > 0) {
                                                if (kg <= maiz) {
                                                    ventas++;

                                                    if (producto.equals("Maiz")) {
                                                        maizvendido += kg;
                                                    }

                                                    double pago = kg * precioventa;
                                                    subtotal += pago;
                                                    lista += "Producto: " + producto + "\nCantidad (kg): " + kg + "\nPrecio por kilogramo: " + precioventa + "\n";
                                                    System.out.println("Desea comprar otro producto? (s/n): ");
                                                    char otro = lea.next().toUpperCase().charAt(0);

                                                    if (otro == 'N') {
                                                        System.out.println("-------------------------------------------------");
                                                        System.out.println("Compras arriba de 1000 reciben 5% de descuento");
                                                        System.out.println("Compras arriba de 5000 reciben 10% de descuento");
                                                        System.out.println("-------------------------------------------------");
                                                        double porcentajedescuento = 0;
                                                        int displaydescuento = 0;

                                                        if (subtotal > 1000) {
                                                            porcentajedescuento = 0.05;
                                                            displaydescuento = 5;
                                                        } else if (subtotal > 5000) {
                                                            porcentajedescuento = 0.1;
                                                            displaydescuento = 10;
                                                        }
                                                        double descuento = subtotal * porcentajedescuento;
                                                        double impuesto = subtotal * 0.07;
                                                        double total = subtotal + impuesto - porcentajedescuento;
                                                        System.out.println("****************** FACTURA ******************");
                                                        System.out.println(lista);
                                                        System.out.println("Subtotal: " + subtotal);
                                                        System.out.print("Impuestos (7%) : ");
                                                        System.out.println(String.format("%.2f", impuesto));
                                                        System.out.println("Tienes un descuento de " + displaydescuento + "% :" + descuento);
                                                        System.out.println("El total a pagar es de: " + total);
                                                        System.out.println("*******************************************\n");
                                                        caja += total;
                                                        dinerorecaudado += total;
                                                        if (total > masganancia) {
                                                            masganancia = total;
                                                            listamasganancia = lista;
                                                        }
                                                        break;
                                                    }
                                                } else {
                                                    System.out.println("No tenemos inventario de este producto");
                                                }
                                                break;
                                            } else {
                                                System.out.println("No se aceptan numeros negativos");
                                            }
                                        }

                                    }
                                }
                                break;
                            }
                        }

                        if (op2 == 3) {
                            while (true) {
                                String lista = "", producto;
                                double subtotal = 0;
                                int kg;
                                int preciocompra;
                                System.out.println("Ingrese que tipo de proveedor es usted: ");
                                char TipoProveedor = lea.next().toUpperCase().charAt(0);

                                if (TipoProveedor != 'A' && TipoProveedor != 'B' && TipoProveedor != 'C') {
                                    System.out.println("Este Tipo de Proveedor No Existe");
                                }

                                if (TipoProveedor == 'C') {
                                    while (true) {
                                        System.out.println("--------------------------------------------------");
                                        System.out.println("Codigo      Producto      Precio / Kg");
                                        System.out.println("2           Avena         Lps. 22");
                                        System.out.println("--------------------------------------------------");
                                        System.out.println("Escriba 5 para salir");
                                        System.out.println("Ingrese el codigo del producto que desea: ");
                                        int codigop = lea.nextInt();

                                        if (codigop == 5) {
                                            break;
                                        }

                                        if (codigop != 1 && codigop != 2 && codigop != 3 && codigop != 4 && codigop != 5) {
                                            System.out.println("Esta no es una opcion");
                                        }

                                        producto = (codigop == 2) ? "Avena" : "No Existe";
                                        preciocompra = (producto.equals("Avena")) ? 22 : 0;

                                        if (codigop == 2) {
                                            System.out.println("Cuantos kilos comprara?: ");
                                            kg = lea.nextInt();
                                            if (kg > 0) {
                                                double pago = kg * preciocompra;
                                                if (pago <= caja) {

                                                    if (producto.equals("Avena")) {
                                                        avena += kg;
                                                    }

                                                    lista += "Producto: " + producto + "\nCantidad (kg): " + kg + "\nPrecio por kilogramo: " + preciocompra + "\n";
                                                    subtotal = pago;
                                                    double impuesto = subtotal * 0.07;
                                                    double total = subtotal + impuesto;

                                                    System.out.println("****************** FACTURA ******************");
                                                    System.out.println(lista);
                                                    System.out.println("Subtotal: " + subtotal);
                                                    System.out.print("Impuestos (7%) : ");
                                                    System.out.println(String.format("%.2f", impuesto));
                                                    System.out.println("El total a pagar es de: " + total);
                                                    System.out.println("*********************************************\n");
                                                    caja -= total;
                                                    compras++;
                                                    dinerogastado += total;

                                                    if (total > masgasto) {
                                                        masgasto = total;
                                                        listamasgasto = lista;
                                                    }
                                                    break;
                                                } else {
                                                    System.out.println("No hay suficiente dinero en caja");
                                                }
                                                break;
                                            } else {
                                                System.out.println("No se aceptan numeros negativos");
                                            }
                                        } else {
                                            System.out.println("No puedes comprar este producto");
                                        }
                                    }
                                } else if (TipoProveedor == 'B') {
                                    while (true) {
                                        System.out.println("--------------------------------------------------");
                                        System.out.println("Codigo      Producto      Precio / Kg");
                                        System.out.println("2           Avena         Lps. 20");
                                        System.out.println("3           Trigo         Lps. 30");
                                        System.out.println("--------------------------------------------------");
                                        System.out.println("Escriba 5 para salir");
                                        System.out.println("Ingrese el codigo del producto que desea: ");
                                        int codigop = lea.nextInt();

                                        producto = (codigop == 2) ? "Avena"
                                                : (codigop == 3) ? "Trigo" : "No Existe";

                                        preciocompra = (producto.equals("Avena")) ? 20
                                                : (producto.equals("Trigo") ? 30 : 0);

                                        if (codigop == 1 && codigop == 4) {
                                            System.out.println("No vende este producto");
                                        }

                                        if (codigop == 5) {
                                            break;
                                        }

                                        if (codigop != 1 && codigop != 4 && codigop != 2 && codigop != 3 && codigop != 5) {
                                            System.out.println("Esta no es una opcion");
                                        }

                                        if (codigop == 2 || codigop == 3) {
                                            System.out.println("Cuantos kilos comprara?: ");
                                            kg = lea.nextInt();
                                            if (kg > 0) {
                                                double pago = kg * preciocompra;
                                                if (pago <= caja) {
                                                    if (producto.equals("Avena")) {
                                                        avena += kg;
                                                    } else if (producto.equals("Trigo")) {
                                                        trigo += kg;
                                                    }

                                                    lista += "Producto: " + producto + "\nCantidad (kg): " + kg + "\nPrecio por kilogramo: " + preciocompra + "\n";
                                                    subtotal = pago;
                                                    double impuesto = subtotal * 0.07;
                                                    double total = subtotal + impuesto;

                                                    System.out.println("****************** FACTURA ******************");
                                                    System.out.println(lista);
                                                    System.out.println("Subtotal: " + subtotal);
                                                    System.out.print("Impuestos (7%) : ");
                                                    System.out.println(String.format("%.2f", impuesto));
                                                    System.out.println("El total a pagar es de: " + total);
                                                    System.out.println("*********************************************\n");
                                                    caja -= total;
                                                    compras++;
                                                    dinerogastado += total;
                                                    if (total > masgasto) {
                                                        masgasto = total;
                                                        listamasgasto = lista;
                                                    }
                                                    break;
                                                } else {
                                                    System.out.println("No hay suficiente dinero en caja");
                                                    break;
                                                }
                                            } else {
                                                System.out.println("No se aceptan numeros negativos");
                                            }
                                        }
                                    }
                                } else if (TipoProveedor == 'A') {
                                    while (true) {
                                        System.out.println("--------------------------------------------------");
                                        System.out.println("Codigo      Producto      Precio / Kg");
                                        System.out.println("1           Azucar        Lps. 25");
                                        System.out.println("4           Maiz          Lps. 18");
                                        System.out.println("--------------------------------------------------");
                                        System.out.println("Escriba 5 para salir");
                                        System.out.println("Ingrese el codigo del producto que desea: ");
                                        int codigop = lea.nextInt();

                                        if (codigop == 5) {
                                            break;
                                        }

                                        if (codigop == 2 || codigop == 3) {
                                            System.out.println("No vende este producto");
                                        }

                                        if (codigop != 1 && codigop != 2 && codigop != 3 && codigop != 4 && codigop != 5) {
                                            System.out.println("Esta no es una opcion");
                                        }

                                        producto = (codigop == 1) ? "Azucar"
                                                : (codigop == 4) ? "Maiz" : "No Existe";

                                        preciocompra = (producto.equals("Azucar")) ? 25
                                                : (producto.equals("Maiz") ? 18 : 0);

                                        if (codigop == 1 || codigop == 4) {
                                            System.out.println("Cuantos kilos comprara?: ");
                                            kg = lea.nextInt();

                                            if (kg > 0) {
                                                double pago = kg * preciocompra;
                                                if (pago <= caja) {

                                                    if (producto.equals("Azucar")) {
                                                        azucar += kg;
                                                    }

                                                    if (producto.equals("Maiz")) {
                                                        maiz += kg;
                                                    }

                                                    lista += "Producto: " + producto + "\nCantidad (kg): " + kg + "\nPrecio por kilogramo: " + preciocompra + "\n";
                                                    subtotal = pago;
                                                    double impuesto = subtotal * 0.07;
                                                    double total = subtotal + impuesto;

                                                    System.out.println("****************** FACTURA ******************");
                                                    System.out.println(lista);
                                                    System.out.println("Subtotal: " + subtotal);
                                                    System.out.print("Impuestos (7%) : ");
                                                    System.out.println(String.format("%.2f", impuesto));
                                                    System.out.println("El total a pagar es de: " + total);
                                                    System.out.println("*********************************************\n");
                                                    caja -= total;
                                                    compras++;
                                                    dinerogastado += total;
                                                    if (total > masgasto) {
                                                        masgasto = total;
                                                        listamasgasto = lista;
                                                    }
                                                    break;
                                                } else {
                                                    System.out.println("No hay suficiente dinero en caja");
                                                    break;
                                                }
                                            } else {
                                                System.out.println("No se aceptan numeros negativos");
                                            }
                                        }
                                    }
                                }
                                break;
                            }
                        }

                        if (op2 == 4) {
                            System.out.println("Dinero en caja actualmente: " + caja + "\n");
                            System.out.println("Compras realizadas: " + compras + "\n");
                            System.out.println("Ventas realizadas: " + ventas + "\n");
                            System.out.println("Cantidad de dinero en ventas: " + dinerorecaudado + "\n");
                            System.out.println("Cantidad de dinero en compras: " + dinerogastado + "\n");
                            System.out.println("Margen de dinero obtenido: " + (dinerorecaudado - dinerogastado) + "\n");
                            try {
                                System.out.println("Promedio de Ventas: " + dinerorecaudado / ventas + "\n");
                            } catch (Exception e) {
                                System.out.println("No se pudo realizar el calculo del promedio de ventas debido a que no se han realizado ventas");
                            }
                            try {
                                System.out.println("Promedio de Compras: " + dinerogastado / compras + "\n");
                            } catch (Exception e) {
                                System.out.println("No se pudo realizar el calculo del promedio de las compras debido a que no se han realizado compras");
                            }

                            if (maizvendido > trigovendido && maizvendido > avenavendida && maizvendido > azucarvendido) {
                                System.out.println("El producto mas vendido es: Maiz");
                                System.out.println("Se vendieron: " + maizvendido + " kg");
                            }

                            if (trigovendido > maizvendido && trigovendido > avenavendida && trigovendido > azucarvendido) {
                                System.out.println("El producto mas vendido es: Trigo");
                                System.out.println("Se vendieron: " + trigovendido + " kg\n");
                            }

                            if (avenavendida > maizvendido && avenavendida > trigovendido && avenavendida > azucarvendido) {
                                System.out.println("El producto mas vendido es: Avena");
                                System.out.println("Se vendieron: " + avenavendida + " kg\n");
                            }

                            if (azucarvendido > maizvendido && azucarvendido > trigovendido && azucarvendido > avenavendida) {
                                System.out.println("El producto mas vendido es: Azucar");
                                System.out.println("Se vendieron: " + azucarvendido + " kg\n");
                            }

                            System.out.println("La compra con mas gasto fue: \n" + listamasgasto);
                            System.out.println("El gasto fue de: " + masgasto + "\n");
                            System.out.println("La venta mas grande fue de: " + listamasganancia);
                            System.out.println("La venta fue de: " + masganancia + "\n");

                            String p1 = "", p2 = "", p3 = "", p4 = "";
                            int v1 = 0, v2 = 0, v3 = 0, v4 = 0;
                            if (maizvendido > trigovendido && trigovendido > azucarvendido && azucarvendido > avenavendida) {
                                p1 = "Maíz";
                                p2 = "Trigo";
                                p3 = "Azúcar";
                                p4 = "Avena";
                                v1 = maizvendido;
                                v2 = trigovendido;
                                v3 = azucarvendido;
                                v4 = avenavendida;
                            } else if (maizvendido > trigovendido && trigovendido > avenavendida && avenavendida > azucarvendido) {
                                p1 = "Maíz";
                                p2 = "Trigo";
                                p3 = "Avena";
                                p4 = "Azúcar";
                                v1 = maizvendido;
                                v2 = trigovendido;
                                v3 = avenavendida;
                                v4 = azucarvendido;
                            } else if (maizvendido > azucarvendido && azucarvendido > trigovendido && trigovendido > avenavendida) {
                                p1 = "Maíz";
                                p2 = "Azúcar";
                                p3 = "Trigo";
                                p4 = "Avena";
                                v1 = maizvendido;
                                v2 = azucarvendido;
                                v3 = trigovendido;
                                v4 = avenavendida;
                            } else if (maizvendido > azucarvendido && azucarvendido > avenavendida && avenavendida > trigovendido) {
                                p1 = "Maíz";
                                p2 = "Azúcar";
                                p3 = "Avena";
                                p4 = "Trigo";
                                v1 = maizvendido;
                                v2 = azucarvendido;
                                v3 = avenavendida;
                                v4 = trigovendido;
                            } else if (maizvendido > avenavendida && avenavendida > trigovendido && trigovendido > azucarvendido) {
                                p1 = "Maíz";
                                p2 = "Avena";
                                p3 = "Trigo";
                                p4 = "Azúcar";
                                v1 = maizvendido;
                                v2 = avenavendida;
                                v3 = trigovendido;
                                v4 = azucarvendido;
                            } else if (maizvendido > avenavendida && avenavendida > azucarvendido && azucarvendido > trigovendido) {
                                p1 = "Maíz";
                                p2 = "Avena";
                                p3 = "Azúcar";
                                p4 = "Trigo";
                                v1 = maizvendido;
                                v2 = avenavendida;
                                v3 = azucarvendido;
                                v4 = trigovendido;
                            } else if (trigovendido > maizvendido && maizvendido > azucarvendido && azucarvendido > avenavendida) {
                                p1 = "Trigo";
                                p2 = "Maíz";
                                p3 = "Azúcar";
                                p4 = "Avena";
                                v1 = trigovendido;
                                v2 = maizvendido;
                                v3 = azucarvendido;
                                v4 = avenavendida;
                            } else if (trigovendido > maizvendido && maizvendido > avenavendida && avenavendida > azucarvendido) {
                                p1 = "Trigo";
                                p2 = "Maíz";
                                p3 = "Avena";
                                p4 = "Azúcar";
                                v1 = trigovendido;
                                v2 = maizvendido;
                                v3 = avenavendida;
                                v4 = azucarvendido;
                            } else if (trigovendido > azucarvendido && azucarvendido > maizvendido && maizvendido > avenavendida) {
                                p1 = "Trigo";
                                p2 = "Azúcar";
                                p3 = "Maíz";
                                p4 = "Avena";
                                v1 = trigovendido;
                                v2 = azucarvendido;
                                v3 = maizvendido;
                                v4 = avenavendida;
                            } else if (trigovendido > azucarvendido && azucarvendido > avenavendida && avenavendida > maizvendido) {
                                p1 = "Trigo";
                                p2 = "Azúcar";
                                p3 = "Avena";
                                p4 = "Maíz";
                                v1 = trigovendido;
                                v2 = azucarvendido;
                                v3 = avenavendida;
                                v4 = maizvendido;
                            } else if (trigovendido > avenavendida && avenavendida > maizvendido && maizvendido > azucarvendido) {
                                p1 = "Trigo";
                                p2 = "Avena";
                                p3 = "Maíz";
                                p4 = "Azúcar";
                                v1 = trigovendido;
                                v2 = avenavendida;
                                v3 = maizvendido;
                                v4 = azucarvendido;
                            } else if (trigovendido > avenavendida && avenavendida > azucarvendido && azucarvendido > maizvendido) {
                                p1 = "Trigo";
                                p2 = "Avena";
                                p3 = "Azúcar";
                                p4 = "Maíz";
                                v1 = trigovendido;
                                v2 = avenavendida;
                                v3 = azucarvendido;
                                v4 = maizvendido;
                            } else if (azucarvendido > maizvendido && maizvendido > trigovendido && trigovendido > avenavendida) {
                                p1 = "Azúcar";
                                p2 = "Maíz";
                                p3 = "Trigo";
                                p4 = "Avena";
                                v1 = azucarvendido;
                                v2 = maizvendido;
                                v3 = trigovendido;
                                v4 = avenavendida;
                            } else if (azucarvendido > maizvendido && maizvendido > avenavendida && avenavendida > trigovendido) {
                                p1 = "Azúcar";
                                p2 = "Maíz";
                                p3 = "Avena";
                                p4 = "Trigo";
                                v1 = azucarvendido;
                                v2 = maizvendido;
                                v3 = avenavendida;
                                v4 = trigovendido;
                            } else if (azucarvendido > trigovendido && trigovendido > maizvendido && maizvendido > avenavendida) {
                                p1 = "Azúcar";
                                p2 = "Trigo";
                                p3 = "Maíz";
                                p4 = "Avena";
                                v1 = azucarvendido;
                                v2 = trigovendido;
                                v3 = maizvendido;
                                v4 = avenavendida;
                            } else if (azucarvendido > trigovendido && trigovendido > avenavendida && avenavendida > maizvendido) {
                                p1 = "Azúcar";
                                p2 = "Trigo";
                                p3 = "Avena";
                                p4 = "Maíz";
                                v1 = azucarvendido;
                                v2 = trigovendido;
                                v3 = avenavendida;
                                v4 = maizvendido;
                            } else if (azucarvendido > avenavendida && avenavendida > maizvendido && maizvendido > trigovendido) {
                                p1 = "Azúcar";
                                p2 = "Avena";
                                p3 = "Maíz";
                                p4 = "Trigo";
                                v1 = azucarvendido;
                                v2 = avenavendida;
                                v3 = maizvendido;
                                v4 = trigovendido;
                            } else if (azucarvendido > avenavendida && avenavendida > trigovendido && trigovendido > maizvendido) {
                                p1 = "Azúcar";
                                p2 = "Avena";
                                p3 = "Trigo";
                                p4 = "Maíz";
                                v1 = azucarvendido;
                                v2 = avenavendida;
                                v3 = trigovendido;
                                v4 = maizvendido;
                            } else if (avenavendida > maizvendido && maizvendido > trigovendido && trigovendido > azucarvendido) {
                                p1 = "Avena";
                                p2 = "Maíz";
                                p3 = "Trigo";
                                p4 = "Azúcar";
                                v1 = avenavendida;
                                v2 = maizvendido;
                                v3 = trigovendido;
                                v4 = azucarvendido;
                            } else if (avenavendida > maizvendido && maizvendido > azucarvendido && azucarvendido > trigovendido) {
                                p1 = "Avena";
                                p2 = "Maíz";
                                p3 = "Azúcar";
                                p4 = "Trigo";
                                v1 = avenavendida;
                                v2 = maizvendido;
                                v3 = azucarvendido;
                                v4 = trigovendido;
                            } else if (avenavendida > trigovendido && trigovendido > maizvendido && maizvendido > azucarvendido) {
                                p1 = "Avena";
                                p2 = "Trigo";
                                p3 = "Maíz";
                                p4 = "Azúcar";
                                v1 = avenavendida;
                                v2 = trigovendido;
                                v3 = maizvendido;
                                v4 = azucarvendido;
                            } else if (avenavendida > trigovendido && trigovendido > azucarvendido && azucarvendido > maizvendido) {
                                p1 = "Avena";
                                p2 = "Trigo";
                                p3 = "Azúcar";
                                p4 = "Maíz";
                                v1 = avenavendida;
                                v2 = trigovendido;
                                v3 = azucarvendido;
                                v4 = maizvendido;
                            } else if (avenavendida > azucarvendido && azucarvendido > maizvendido && maizvendido > trigovendido) {
                                p1 = "Avena";
                                p2 = "Azúcar";
                                p3 = "Maíz";
                                p4 = "Trigo";
                                v1 = avenavendida;
                                v2 = azucarvendido;
                                v3 = maizvendido;
                                v4 = trigovendido;
                            } else {
                                p1 = "Avena";
                                p2 = "Azúcar";
                                p3 = "Trigo";
                                p4 = "Maíz";
                                v1 = avenavendida;
                                v2 = azucarvendido;
                                v3 = trigovendido;
                                v4 = maizvendido;
                            }

                            System.out.println("Ranking de ventas:");
                            System.out.println("1. " + p1 + " con " + v1 + " ventas");
                            System.out.println("2. " + p2 + " con " + v2 + " ventas");
                            System.out.println("3. " + p3 + " con " + v3 + " ventas");
                            System.out.println("4. " + p4 + " con " + v4 + " ventas");

                        }

                        if (op2 == 5) {
                            while (true) {
                                System.out.println("Cerrando caja...");
                                System.out.println("Dinero en el banco actualmente: " + banco + " .lps");
                                System.out.println("Cuanto dinero quiere depositar al banco?: ");
                                double deposito = lea.nextDouble();
                                double porcentajedeposito = deposito / caja;
                                if (porcentajedeposito <= 0.6) {
                                    System.out.println("Se ha depositado+ " + deposito + " lps en el banco");
                                    banco += deposito;
                                    System.out.println("Cantidad en el banco: " + banco);
                                    dia++;
                                    caja -= deposito;
                                    maizvendido = 0;
                                    trigovendido = 0;
                                    azucarvendido = 0;
                                    avenavendida = 0;
                                    dinerorecaudado = 0;
                                    dinerogastado = 0;
                                    masganancia = 0;
                                    masgasto = 0;
                                    listamasganancia = "";
                                    listamasgasto = "";
                                    compras = 0;
                                    ventas = 0;
                                    llave = 1;
                                    break;
                                } else {
                                    System.out.println("No se puede depositar esta cantidad ya que es mas del 60% de dinero en caja");
                                }
                            }
                        }

                        if (op2 == 6) {
                            System.out.println("Saliendo del Sistema...");
                            System.exit(0);
                        }
                    } while (llave == 0);
                }

            } else if (op == 2) {
                System.out.println("Saliendo del Sistema");
                break;
            } else {
                System.out.println("Esta opcion no existe");
            }
        }
    }

}
