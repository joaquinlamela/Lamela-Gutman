package Dominio;

import java.util.ArrayList;

public class Sistema {

    //Atributos:
    private ArrayList<Venta> listaDeVentasDelSistema;
    private ArrayList<PreVenta> listaDePreventas;
    private Tienda echoShop;
    private int cantPreVentas;
    private ArrayList<Persona> listaCliente;
    
    
    private ArrayList<Producto> productosAVenderEnSesionActiva; 
    private int [] cantidadPorIdDeProd; 

    //Constructor:
    public Sistema() {
        this.listaDePreventas = new ArrayList<PreVenta>();
        this.listaDeVentasDelSistema = new ArrayList<Venta>();
        this.echoShop = new Tienda();
        this.cantPreVentas = 0;
        this.listaCliente = new ArrayList<Persona>();
        this.productosAVenderEnSesionActiva= new ArrayList<Producto>(); 
        this.cantidadPorIdDeProd= new int[25]; 
    }

    public int getCantPreVentas() {
        return cantPreVentas;
    }

    public void setCantPreVentas(int cantPreVentas) {
        this.cantPreVentas = cantPreVentas;
    }

    //Get´s && Set´s
    public ArrayList<Venta> getListaDeVentasDelSitema() {
        return listaDeVentasDelSistema;
    }

    public void setListaDeVentasDelSitema(ArrayList<Venta> listaDeVentasDelSitema) {
        this.listaDeVentasDelSistema = listaDeVentasDelSitema;
    }

    public ArrayList<PreVenta> getListaDePreventas() {
        return listaDePreventas;
    }

    public void setListaDePreventas(ArrayList<PreVenta> listaDePreventas) {
        this.listaDePreventas = listaDePreventas;
    }

    public Tienda getEchoShop() {
        return this.echoShop;
    }

    public void setEchToShop(Tienda listaDeEchoShop) {
        this.echoShop = listaDeEchoShop;
    }

    public ArrayList<Persona> getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(ArrayList<Persona> listaCliente) {
        this.listaCliente = listaCliente;
    }

    public ArrayList<Producto> getProductosAVenderEnSesionActiva() {
        return productosAVenderEnSesionActiva;
    }

    public void setProductosAVenderEnSesionActiva(ArrayList<Producto> productosAVenderEnSesionActiva) {
        this.productosAVenderEnSesionActiva = productosAVenderEnSesionActiva;
    }

    public int[] getCantidadPorIdDeProd() {
        return cantidadPorIdDeProd;
    }

    public void setCantidadPorIdDeProd(int[] cantidadPorIdDeProd) {
        this.cantidadPorIdDeProd = cantidadPorIdDeProd;
    }
    
    
    
    
    

    //Metodos:
    public void agregarSucursal(Sucursal nueva) {
//TODO metodo para que se vea en el mapa
        this.echoShop.getSucursales().add(nueva);
        this.echoShop.setNumeroSucursal(this.echoShop.getNumeroSucursal() + 1);

    }

    public void eliminarSucursal(Sucursal aEliminar) {
//TODO metodo para que se deje de ver en el mapa
        for (int i = 0; i < this.echoShop.getSucursales().size(); i++) {
            if (this.echoShop.getSucursales().get(i).getNumeroSucursal() == aEliminar.getNumeroSucursal()) {
                this.echoShop.getSucursales().remove(i);
            }
        }
    }

  public void agregarVenta(Venta venta) {
//TODO agregar Ticket electronico
        if (!this.listaDeVentasDelSistema.contains(venta)) {
            this.listaDeVentasDelSistema.add(venta);
            ArrayList<Producto> listaProductosParaVender = venta.getListaDeProductosAVender();
            for (int i = 0; i < listaProductosParaVender.size(); i++) {
                Producto vendido = listaProductosParaVender.get(i);
                vendido.setCantidadVendidos(vendido.getCantidadVendidos() + 1);
            }
            venta.setCodigoIdentificadorDeVenta(this.listaDeVentasDelSistema.size() + 1);
        }
    }

    public void eliminarVenta(Venta venta) {

        if (this.listaDeVentasDelSistema.contains(venta)) {

            for (int i = 0; i < this.listaDeVentasDelSistema.size(); i++) {
                int id = this.listaDeVentasDelSistema.get(i).getCodigoIdentificadorDeVenta();
                if (id> venta.getCodigoIdentificadorDeVenta()) {
                    this.listaDeVentasDelSistema.get(i).setCodigoIdentificadorDeVenta(this.listaDeVentasDelSistema.get(i).getCodigoIdentificadorDeVenta()-1);
                }
            }
            this.listaDeVentasDelSistema.remove(venta);
        }
    }

    public void agregarPreVenta(PreVenta preCompra) {

//TODO falta calendario
        //preCompra.setIdentificadorDePreventa(this.getCantPreVentas()+1);
        if (!this.listaDePreventas.contains(preCompra)) {
            this.setCantPreVentas(this.getCantPreVentas() + 1);
            preCompra.setIdentificadorDePreventa(this.getCantPreVentas());
            this.listaDePreventas.add(preCompra);
        }
    }

    public void cancelarPreVenta(PreVenta preCompra) {
//TODO eliminar del calendario
        if (this.listaDePreventas.contains(preCompra)) {
            this.listaDePreventas.remove(preCompra);
            for (int i = 0; i < this.listaDePreventas.size(); i++) {
                PreVenta preVen = this.listaDePreventas.get(i);
                if (preCompra.getIdentificadorDePreventa() < preVen.getIdentificadorDePreventa()) {
                    preVen.setIdentificadorDePreventa(preVen.getIdentificadorDePreventa() - 1);
                }
            }
        }

    }

    public void actualizarStock(Venta venta) {
        Tienda tiendaDeVenta = venta.getEchoShop();
        ArrayList<Producto> listaDeProductosComprados = venta.getListaDeProductosAVender();
        for (int i = 0; i < tiendaDeVenta.getListaDeProductosEnStock().size(); i++) {
            Producto productoComprado = listaDeProductosComprados.get(i);
            tiendaDeVenta.getStockDeProductoPorId()[productoComprado.getCodigoIdentificador()] = tiendaDeVenta.getStockDeProductoPorId()[productoComprado.getCodigoIdentificador()] - venta.getCantidadesPorProducto()[productoComprado.getCodigoIdentificador()];
        }

    }

    public int ponerIdentificadorAProducto() {
        int cantidadDeElementos = this.echoShop.getListaDeProductosEnStock().size() + 1;
        return cantidadDeElementos++;
    }

    public int ponerIdentificadorAEnvase() {
        int cantidadDeElementos = this.echoShop.getTodosLosEnvasesDisponibles().size() + 1;
        return cantidadDeElementos++;
    }

    public void agregarCliente(Persona cliente) {
        if (!this.listaCliente.contains(cliente)) {
            this.listaCliente.add(cliente);
        }
    }

    public void mostrar() {
        for (int i = 0; i < this.getEchoShop().getListaDeProductosEnStock().size(); i++) {
            System.out.println(this.getEchoShop().getListaDeProductosEnStock().get(i));

        }
    }
    
    
    public void agregarProductosALaListaDeProductosSesionActiva(Producto producto){
        if(!this.getProductosAVenderEnSesionActiva().contains(producto)){
            this.getProductosAVenderEnSesionActiva().add(producto); 
        }
    }
    
    public String factura(Venta v){
        String retorno = "";
        String productos = "";
        String envases = "";
        for (int i = 0; i < v.getListaDeProductosAVender().size(); i++) {
            productos += "<tr>\n" +
"	<td class=\"desc\">"+v.getListaDeProductosAVender().get(i).getNombre()+"</td>\n" +
"	<td class=\"qty\">1</td>\n" +
"	<td class=\"unit\">"+v.getListaDeProductosAVender().get(i).getPrecio()+"</td>\n" +
"	<td class=\"total\">"+v.getListaDeProductosAVender().get(i).getPrecio()+"</td>\n" +
"	</tr>\n";
        }
        
        for (int i = 0; i < v.getListaDeEnvasesUtilizados().size(); i++) {
            envases+= "<tr>\n" +
"		<td class=\"desc\">"+v.getListaDeEnvasesUtilizados().get(i).getNombre()+"</td>\n" +
"		<td class=\"qty\">"+v.getListaDeEnvasesUtilizados().get(i).getIdIdentificador()+"</td>\n" +
"		<td class=\"unit\">"+v.getListaDeEnvasesUtilizados().get(i).getPesoMaximoSoportado()+"</td>\n" +
"	</tr>\n";
        }
        
        retorno = "<!DOCTYPE html>\n" +
"<html>\n" +
"<head>\n" +
"	<title>HTML to API - Invoice</title>\n" +
"	<link href='https://fonts.googleapis.com/css?family=Source+Sans+Pro:400,300,700&subset=latin,latin-ext' rel='stylesheet' type='text/css'>\n" +
"	<!-- <link rel=\"stylesheet\" href=\"sass/main.css\" media=\"screen\" charset=\"utf-8\"/> -->\n" +
"	<meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\n" +
"	<meta http-equiv=\"content-type\" content=\"text-html; charset=utf-8\">\n" +
"	<style type=\"text/css\">\n" +
"		html, body, div, span, applet, object, iframe,\n" +
"		h1, h2, h3, h4, h5, h6, p, blockquote, pre,\n" +
"		a, abbr, acronym, address, big, cite, code,\n" +
"		del, dfn, em, img, ins, kbd, q, s, samp,\n" +
"		small, strike, strong, sub, sup, tt, var,\n" +
"		b, u, i, center,\n" +
"		dl, dt, dd, ol, ul, li,\n" +
"		fieldset, form, label, legend,\n" +
"		table, caption, tbody, tfoot, thead, tr, th, td,\n" +
"		article, aside, canvas, details, embed,\n" +
"		figure, figcaption, footer, header, hgroup,\n" +
"		menu, nav, output, ruby, section, summary,\n" +
"		time, mark, audio, video {\n" +
"			margin: 0;\n" +
"			padding: 0;\n" +
"			border: 0;\n" +
"			font: inherit;\n" +
"			font-size: 100%;\n" +
"			vertical-align: baseline;\n" +
"		}\n" +
"\n" +
"		html {\n" +
"			line-height: 1;\n" +
"		}\n" +
"\n" +
"		ol, ul {\n" +
"			list-style: none;\n" +
"		}\n" +
"\n" +
"		table {\n" +
"			border-collapse: collapse;\n" +
"			border-spacing: 0;\n" +
"		}\n" +
"\n" +
"		caption, th, td {\n" +
"			text-align: left;\n" +
"			font-weight: normal;\n" +
"			vertical-align: middle;\n" +
"		}\n" +
"\n" +
"		q, blockquote {\n" +
"			quotes: none;\n" +
"		}\n" +
"		q:before, q:after, blockquote:before, blockquote:after {\n" +
"			content: \"\";\n" +
"			content: none;\n" +
"		}\n" +
"\n" +
"		a img {\n" +
"			border: none;\n" +
"		}\n" +
"\n" +
"		article, aside, details, figcaption, figure, footer, header, hgroup, main, menu, nav, section, summary {\n" +
"			display: block;\n" +
"		}\n" +
"\n" +
"		body {\n" +
"			font-family: 'Source Sans Pro', sans-serif;\n" +
"			font-weight: 300;\n" +
"			font-size: 12px;\n" +
"			margin: 0;\n" +
"			padding: 0;\n" +
"		}\n" +
"		body a {\n" +
"			text-decoration: none;\n" +
"			color: inherit;\n" +
"		}\n" +
"		body a:hover {\n" +
"			color: inherit;\n" +
"			opacity: 0.7;\n" +
"		}\n" +
"		body .container {\n" +
"			min-width: 500px;\n" +
"			margin: 0 auto;\n" +
"			padding: 0 20px;\n" +
"		}\n" +
"		body .clearfix:after {\n" +
"			content: \"\";\n" +
"			display: table;\n" +
"			clear: both;\n" +
"		}\n" +
"		body .left {\n" +
"			float: left;\n" +
"		}\n" +
"		body .right {\n" +
"			float: right;\n" +
"		}\n" +
"		body .helper {\n" +
"			display: inline-block;\n" +
"			height: 100%;\n" +
"			vertical-align: middle;\n" +
"		}\n" +
"		body .no-break {\n" +
"			page-break-inside: avoid;\n" +
"		}\n" +
"\n" +
"		header {\n" +
"			margin-top: 20px;\n" +
"			margin-bottom: 50px;\n" +
"		}\n" +
"		header figure {\n" +
"			float: left;\n" +
"			width: 60px;\n" +
"			height: 60px;\n" +
"			margin-right: 10px;\n" +
"			background-color: #8BC34A;\n" +
"			border-radius: 50%;\n" +
"			text-align: center;\n" +
"		}\n" +
"		header figure img {\n" +
"			margin-top: 13px;\n" +
"		}\n" +
"		header .company-address {\n" +
"			float: left;\n" +
"			max-width: 150px;\n" +
"			line-height: 1.7em;\n" +
"		}\n" +
"		header .company-address .title {\n" +
"			color: #8BC34A;\n" +
"			font-weight: 400;\n" +
"			font-size: 1.5em;\n" +
"			text-transform: uppercase;\n" +
"		}\n" +
"		header .company-contact {\n" +
"			float: right;\n" +
"			height: 60px;\n" +
"			padding: 0 10px;\n" +
"			background-color: #8BC34A;\n" +
"			color: white;\n" +
"		}\n" +
"		header .company-contact span {\n" +
"			display: inline-block;\n" +
"			vertical-align: middle;\n" +
"		}\n" +
"		header .company-contact .circle {\n" +
"			width: 20px;\n" +
"			height: 20px;\n" +
"			background-color: white;\n" +
"			border-radius: 50%;\n" +
"			text-align: center;\n" +
"		}\n" +
"		header .company-contact .circle img {\n" +
"			vertical-align: middle;\n" +
"		}\n" +
"		header .company-contact .phone {\n" +
"			height: 100%;\n" +
"			margin-right: 20px;\n" +
"		}\n" +
"		header .company-contact .email {\n" +
"			height: 100%;\n" +
"			min-width: 100px;\n" +
"			text-align: right;\n" +
"		}\n" +
"\n" +
"		section .details {\n" +
"			margin-bottom: 55px;\n" +
"		}\n" +
"		section .details .client {\n" +
"			width: 50%;\n" +
"			line-height: 20px;\n" +
"		}\n" +
"		section .details .client .name {\n" +
"			color: #8BC34A;\n" +
"		}\n" +
"		section .details .data {\n" +
"			width: 50%;\n" +
"			text-align: right;\n" +
"		}\n" +
"		section .details .title {\n" +
"			margin-bottom: 15px;\n" +
"			color: #8BC34A;\n" +
"			font-size: 3em;\n" +
"			font-weight: 400;\n" +
"			text-transform: uppercase;\n" +
"		}\n" +
"		section table {\n" +
"			width: 100%;\n" +
"			border-collapse: collapse;\n" +
"			border-spacing: 0;\n" +
"			font-size: 0.9166em;\n" +
"		}\n" +
"		section table .qty, section table .unit, section table .total {\n" +
"			width: 15%;\n" +
"		}\n" +
"		section table .desc {\n" +
"			width: 55%;\n" +
"		}\n" +
"		section table thead {\n" +
"			display: table-header-group;\n" +
"			vertical-align: middle;\n" +
"			border-color: inherit;\n" +
"		}\n" +
"		section table thead th {\n" +
"			padding: 5px 10px;\n" +
"			background: #8BC34A;\n" +
"			border-bottom: 5px solid #FFFFFF;\n" +
"			border-right: 4px solid #FFFFFF;\n" +
"			text-align: right;\n" +
"			color: white;\n" +
"			font-weight: 400;\n" +
"			text-transform: uppercase;\n" +
"		}\n" +
"		section table thead th:last-child {\n" +
"			border-right: none;\n" +
"		}\n" +
"		section table thead .desc {\n" +
"			text-align: left;\n" +
"		}\n" +
"		section table thead .qty {\n" +
"			text-align: center;\n" +
"		}\n" +
"		section table tbody td {\n" +
"			padding: 10px;\n" +
"			background: #E8F3DB;\n" +
"			color: #777777;\n" +
"			text-align: right;\n" +
"			border-bottom: 5px solid #FFFFFF;\n" +
"			border-right: 4px solid #E8F3DB;\n" +
"		}\n" +
"		section table tbody td:last-child {\n" +
"			border-right: none;\n" +
"		}\n" +
"		section table tbody h3 {\n" +
"			margin-bottom: 5px;\n" +
"			color: #8BC34A;\n" +
"			font-weight: 600;\n" +
"		}\n" +
"		section table tbody .desc {\n" +
"			text-align: left;\n" +
"		}\n" +
"		section table tbody .qty {\n" +
"			text-align: center;\n" +
"		}\n" +
"		section table.grand-total {\n" +
"			margin-bottom: 45px;\n" +
"		}\n" +
"		section table.grand-total td {\n" +
"			padding: 5px 10px;\n" +
"			border: none;\n" +
"			color: #777777;\n" +
"			text-align: right;\n" +
"		}\n" +
"		section table.grand-total .desc {\n" +
"			background-color: transparent;\n" +
"		}\n" +
"		section table.grand-total tr:last-child td {\n" +
"			font-weight: 600;\n" +
"			color: #8BC34A;\n" +
"			font-size: 1.18181818181818em;\n" +
"		}\n" +
"\n" +
"		footer {\n" +
"			margin-bottom: 20px;\n" +
"		}\n" +
"		footer .thanks {\n" +
"			margin-bottom: 40px;\n" +
"			color: #8BC34A;\n" +
"			font-size: 1.16666666666667em;\n" +
"			font-weight: 600;\n" +
"		}\n" +
"		footer .notice {\n" +
"			margin-bottom: 25px;\n" +
"		}\n" +
"		footer .end {\n" +
"			padding-top: 5px;\n" +
"			border-top: 2px solid #8BC34A;\n" +
"			text-align: center;\n" +
"		}\n" +
"	</style>\n" +
"</head>\n" +
"\n" +
"<body>\n" +
"	<header class=\"clearfix\">\n" +
"		<div class=\"container\">\n" +
"			<figure>\n" +
"				<img class=\"logo\" src=\"data:image/svg+xml;charset=utf-8;base64,PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0iVVRGLTgiIHN0YW5kYWxvbmU9Im5vIj8+Cjxzdmcgd2lkdGg9IjM5cHgiIGhlaWdodD0iMzFweCIgdmlld0JveD0iMCAwIDM5IDMxIiB2ZXJzaW9uPSIxLjEiIHhtbG5zPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwL3N2ZyIgeG1sbnM6eGxpbms9Imh0dHA6Ly93d3cudzMub3JnLzE5OTkveGxpbmsiIHhtbG5zOnNrZXRjaD0iaHR0cDovL3d3dy5ib2hlbWlhbmNvZGluZy5jb20vc2tldGNoL25zIj4KICAgIDwhLS0gR2VuZXJhdG9yOiBTa2V0Y2ggMy40LjEgKDE1NjgxKSAtIGh0dHA6Ly93d3cuYm9oZW1pYW5jb2RpbmcuY29tL3NrZXRjaCAtLT4KICAgIDx0aXRsZT5ob21lNDwvdGl0bGU+CiAgICA8ZGVzYz5DcmVhdGVkIHdpdGggU2tldGNoLjwvZGVzYz4KICAgIDxkZWZzPjwvZGVmcz4KICAgIDxnIGlkPSJQYWdlLTEiIHN0cm9rZT0ibm9uZSIgc3Ryb2tlLXdpZHRoPSIxIiBmaWxsPSJub25lIiBmaWxsLXJ1bGU9ImV2ZW5vZGQiIHNrZXRjaDp0eXBlPSJNU1BhZ2UiPgogICAgICAgIDxnIGlkPSJJTlZPSUNFLTEiIHNrZXRjaDp0eXBlPSJNU0FydGJvYXJkR3JvdXAiIHRyYW5zZm9ybT0idHJhbnNsYXRlKC00Mi4wMDAwMDAsIC00NS4wMDAwMDApIiBmaWxsPSIjRkZGRkZGIj4KICAgICAgICAgICAgPGcgaWQ9IlpBR0xBVkxKRSIgc2tldGNoOnR5cGU9Ik1TTGF5ZXJHcm91cCIgdHJhbnNmb3JtPSJ0cmFuc2xhdGUoMzAuMDAwMDAwLCAxNS4wMDAwMDApIj4KICAgICAgICAgICAgICAgIDxnIGlkPSJob21lNCIgdHJhbnNmb3JtPSJ0cmFuc2xhdGUoMTIuMDAwMDAwLCAzMC4wMDAwMDApIiBza2V0Y2g6dHlwZT0iTVNTaGFwZUdyb3VwIj4KICAgICAgICAgICAgICAgICAgICA8cGF0aCBkPSJNMzguMjc5MzM1LDE0LjAzOTk1MiBMMzIuMzc5MDM3OCw5LjAxMjMzODM1IEwzMi4zNzkwMzc4LDMuMjA0MzM2NzQgQzMyLjM3OTAzNzgsMi4xNTQ0MTY1MyAzMS4zODA1NTkyLDEuMzAzMjk3MjggMzAuMTQ2MDE3NiwxLjMwMzI5NzI4IEMyOC45MTQ2MTk2LDEuMzAzMjk3MjggMjcuOTE2MTQxMSwyLjE1NDQxNjUzIDI3LjkxNjE0MTEsMy4yMDQzMzY3NCBMMjcuOTE2MTQxMSw1LjIwOTMzODY1IEwyMy41MjI2OTc3LDEuNDY1NzY5OTggQzIxLjM1MDM4NzksLTAuMzgzODc0MjAyIDE3LjU3MzY3NTEsLTAuMzgwNjA5NjggMTUuNDA2NjcsMS40NjkwMzQ1IEwwLjY1MzA3ODA4NiwxNC4wMzk5NTIgQy0wLjIxNzU5NDQ1OCwxNC43ODM1MDk1IC0wLjIxNzU5NDQ1OCwxNS45ODY3Nzg1IDAuNjUzMDc4MDg2LDE2LjcyODk5NjYgQzEuNTI0NjM0NzYsMTcuNDcyNTU0MSAyLjkzOTQ0MDgxLDE3LjQ3MjU1NDEgMy44MTAxMTMzNSwxNi43Mjg5OTY2IEwxOC41NjIxMzM1LDQuMTU4MDc5MTUgQzE5LjA0MzAwMjUsMy43NTA2ODM2NSAxOS44ODk5MDE4LDMuNzUwNjgzNjUgMjAuMzY4MDIwMiw0LjE1NjgyMzU2IEwzNS4xMjIyOTk3LDE2LjcyODk5NjYgQzM1LjU2MDE0MTEsMTcuMTAwNzMzNSAzNi4xMzA0MDU1LDE3LjI4NTgwNjcgMzYuNzAwNjcsMTcuMjg1ODA2NyBDMzcuMjcyMDE1MSwxNy4yODU4MDY3IDM3Ljg0MzQ1ODQsMTcuMTAwNzMzNSAzOC4yNzk3MjgsMTYuNzI4OTk2NiBDMzkuMTUwNzkzNSwxNS45ODY3Nzg1IDM5LjE1MDc5MzUsMTQuNzgzNTA5NSAzOC4yNzkzMzUsMTQuMDM5OTUyIEwzOC4yNzkzMzUsMTQuMDM5OTUyIFoiIGlkPSJGaWxsLTEiPjwvcGF0aD4KICAgICAgICAgICAgICAgICAgICA8cGF0aCBkPSJNMjAuMjQxMzkyOSw3Ljc2Njk2NTM5IEMxOS44MTI3ODU5LDcuNDAyMDA4NjcgMTkuMTE4OTM5NSw3LjQwMjAwODY3IDE4LjY5MTUxMTMsNy43NjY5NjUzOSBMNS43MTQyMzY3OCwxOC44MjEzMDM2IEM1LjUwOTMxNDg2LDE4Ljk5NTU3ODggNS4zOTMzOTU0NywxOS4yMzM5NzI1IDUuMzkzMzk1NDcsMTkuNDgyNDEwOSBMNS4zOTMzOTU0NywyNy41NDUzNTk2IEM1LjM5MzM5NTQ3LDI5LjQzNzE5MTQgNy4xOTM1ODQzOCwzMC45NzEwMTQxIDkuNDEzODMzNzUsMzAuOTcxMDE0MSBMMTUuODM4NzE1NCwzMC45NzEwMTQxIEwxNS44Mzg3MTU0LDIyLjQ5MjU1MDUgTDIzLjA5MjUxODksMjIuNDkyNTUwNSBMMjMuMDkyNTE4OSwzMC45NzEwMTQxIEwyOS41MTc4OTE3LDMwLjk3MTAxNDEgQzMxLjczODE0MTEsMzAuOTcxMDE0MSAzMy41MzgyMzE3LDI5LjQzNzE5MTQgMzMuNTM4MjMxNywyNy41NDUzNTk2IEwzMy41MzgyMzE3LDE5LjQ4MjQxMDkgQzMzLjUzODIzMTcsMTkuMjMzOTcyNSAzMy40MjMwOTgyLDE4Ljk5NTU3ODggMzMuMjE3NDg4NywxOC44MjEzMDM2IEwyMC4yNDEzOTI5LDcuNzY2OTY1MzkgWiIgaWQ9IkZpbGwtMyI+PC9wYXRoPgogICAgICAgICAgICAgICAgPC9nPgogICAgICAgICAgICA8L2c+CiAgICAgICAgPC9nPgogICAgPC9nPgo8L3N2Zz4=\" alt=\"\">\n" +
"			</figure>\n" +
"			<div class=\"company-address\">\n" +
"				<h2 class=\"title\">Echo Shop</h2>\n" +
"				<p>\n" +
"					"+v.getDireccionAEnviar()+"<br>\n" +
"\n" +
"				</p>\n" +
"			</div>\n" +
"			<div class=\"company-contact\">\n" +
"				<div class=\"phone left\">\n" +
"					<span class=\"circle\"><img src=\"data:image/svg+xml;charset=utf-8;base64,PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0idXRmLTgiPz4NCjwhLS0gR2VuZXJhdG9yOiBBZG9iZSBJbGx1c3RyYXRvciAxNS4xLjAsIFNWRyBFeHBvcnQgUGx1Zy1JbiAuIFNWRyBWZXJzaW9uOiA2LjAwIEJ1aWxkIDApICAtLT4NCjwhRE9DVFlQRSBzdmcgUFVCTElDICItLy9XM0MvL0RURCBTVkcgMS4xLy9FTiIgImh0dHA6Ly93d3cudzMub3JnL0dyYXBoaWNzL1NWRy8xLjEvRFREL3N2ZzExLmR0ZCI+DQo8c3ZnIHZlcnNpb249IjEuMSIgaWQ9IkxheWVyXzEiIHhtbG5zOnNrZXRjaD0iaHR0cDovL3d3dy5ib2hlbWlhbmNvZGluZy5jb20vc2tldGNoL25zIg0KCSB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHhtbG5zOnhsaW5rPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5L3hsaW5rIiB4PSIwcHgiIHk9IjBweCIgd2lkdGg9IjkuNzYycHgiIGhlaWdodD0iOS45NThweCINCgkgdmlld0JveD0iLTQuOTkyIDAuNTE5IDkuNzYyIDkuOTU4IiBlbmFibGUtYmFja2dyb3VuZD0ibmV3IC00Ljk5MiAwLjUxOSA5Ljc2MiA5Ljk1OCIgeG1sOnNwYWNlPSJwcmVzZXJ2ZSI+DQo8dGl0bGU+RmlsbCAxPC90aXRsZT4NCjxkZXNjPkNyZWF0ZWQgd2l0aCBTa2V0Y2guPC9kZXNjPg0KPGcgaWQ9IlBhZ2UtMSIgc2tldGNoOnR5cGU9Ik1TUGFnZSI+DQoJPGcgaWQ9IklOVk9JQ0UtMSIgdHJhbnNmb3JtPSJ0cmFuc2xhdGUoLTMwMS4wMDAwMDAsIC01NC4wMDAwMDApIiBza2V0Y2g6dHlwZT0iTVNBcnRib2FyZEdyb3VwIj4NCgkJPGcgaWQ9IlpBR0xBVkxKRSIgdHJhbnNmb3JtPSJ0cmFuc2xhdGUoMzAuMDAwMDAwLCAxNS4wMDAwMDApIiBza2V0Y2g6dHlwZT0iTVNMYXllckdyb3VwIj4NCgkJCTxnIGlkPSJLT05UQUtUSSIgdHJhbnNmb3JtPSJ0cmFuc2xhdGUoMjY3LjAwMDAwMCwgMzUuMDAwMDAwKSIgc2tldGNoOnR5cGU9Ik1TU2hhcGVHcm91cCI+DQoJCQkJPGcgaWQ9Ik92YWwtMS1feDJCXy1GaWxsLTEiPg0KCQkJCQk8cGF0aCBpZD0iRmlsbC0xIiBmaWxsPSIjOEJDMzRBIiBkPSJNOC43NjUsMTIuMzc1YzAuMDIsMC4xNjItMC4wMjgsMC4zMDMtMC4xNDMsMC40MjJMNy4yNDYsMTQuMTkNCgkJCQkJCWMtMC4wNjIsMC4wNy0wLjE0MywwLjEzMy0wLjI0MywwLjE4MmMtMC4xMDEsMC4wNDktMC4xOTcsMC4wOC0wLjI5NSwwLjA5NGMtMC4wMDcsMC0wLjAyOCwwLTAuMDYyLDAuMDA0DQoJCQkJCQljLTAuMDM0LDAuMDA1LTAuMDgsMC4wMDgtMC4xMzQsMC4wMDhjLTAuMTMxLDAtMC4zNDMtMC4wMjMtMC42MzUtMC4wNjhjLTAuMjkzLTAuMDQ1LTAuNjUxLTAuMTU4LTEuMDc2LTAuMzM2DQoJCQkJCQljLTAuNDI0LTAuMTgyLTAuOTA0LTAuNDUxLTEuNDQyLTAuODA5Yy0wLjUzNi0wLjM1Ny0xLjEwOS0wLjg1Mi0xLjcxNi0xLjQ3OWMtMC40ODEtMC40ODQtMC44OC0wLjk1LTEuMTk4LTEuMzkzDQoJCQkJCQlDMC4xMjgsOS45NS0wLjEyNSw5LjU0MS0wLjMxOSw5LjE2NGMtMC4xOTMtMC4zNzYtMC4zMzgtMC43MTctMC40MzQtMS4wMjNjLTAuMDk3LTAuMzA2LTAuMTYxLTAuNTctMC4xOTUtMC43OTINCgkJCQkJCWMtMC4wMzUtMC4yMjEtMC4wNS0wLjM5NC0wLjA0Mi0wLjUyMWMwLjAwNy0wLjEyNiwwLjAxLTAuMTk3LDAuMDEtMC4yMTFjMC4wMTQtMC4wOTksMC4wNDQtMC4xOTgsMC4wOTMtMC4zMDENCgkJCQkJCWMwLjA0OS0wLjEwMSwwLjEwOC0wLjE4NCwwLjE3Ni0wLjI0N2wxLjM3NS0xLjQwM2MwLjA5Ny0wLjA5OCwwLjIwNi0wLjE0NywwLjMzLTAuMTQ3YzAuMDksMCwwLjE2OSwwLjAyNiwwLjIzOCwwLjA3OQ0KCQkJCQkJQzEuMyw0LjY0OCwxLjM1OSw0LjcxNCwxLjQwNiw0Ljc5MWwxLjEwNiwyLjE0MWMwLjA2MiwwLjExNCwwLjA4LDAuMjM1LDAuMDUyLDAuMzdDMi41MzgsNy40MzYsMi40NzgsNy41NDgsMi4zODksNy42NA0KCQkJCQkJTDEuODgzLDguMTU3QzEuODY5LDguMTcxLDEuODU2LDguMTk0LDEuODQ2LDguMjI2QzEuODM1LDguMjU2LDEuODMsOC4yODMsMS44Myw4LjMwNGMwLjAyNywwLjE0NywwLjA5LDAuMzE3LDAuMTg3LDAuNTA3DQoJCQkJCQljMC4wODIsMC4xNjksMC4yMSwwLjM3NSwwLjM4MiwwLjYxOGMwLjE3MiwwLjI0MywwLjQxNywwLjUyMSwwLjczNCwwLjgzOWMwLjMxMSwwLjMyMiwwLjU4NSwwLjU3NCwwLjgyOCwwLjc1NQ0KCQkJCQkJYzAuMjQsMC4xNzgsMC40NDMsMC4zMDksMC42MDQsMC4zOTVjMC4xNjIsMC4wODUsMC4yODYsMC4xMzUsMC4zNzIsMC4xNTRsMC4xMjgsMC4wMjRjMC4wMTUsMCwwLjAzOC0wLjAwNiwwLjA2Ny0wLjAxNg0KCQkJCQkJYzAuMDMyLTAuMDEsMC4wNTQtMC4wMjEsMC4wNjctMC4wMzdsMC41ODgtMC42MTJjMC4xMjUtMC4xMTIsMC4yNy0wLjE2OCwwLjQzNi0wLjE2OGMwLjExNywwLDAuMjA3LDAuMDIxLDAuMjc3LDAuMDYxaDAuMDENCgkJCQkJCWwxLjk5NSwxLjIwM0M4LjY1MSwxMi4xMiw4LjczNywxMi4yMzQsOC43NjUsMTIuMzc1TDguNzY1LDEyLjM3NXoiLz4NCgkJCQk8L2c+DQoJCQk8L2c+DQoJCTwvZz4NCgk8L2c+DQo8L2c+DQo8L3N2Zz4NCg==\" alt=\"\"><span class=\"helper\"></span></span>\n" +
"					<a href=\"tel:602-519-0450\">Número de teléfono</a>\n" +
"					<span class=\"helper\"></span>\n" +
"				</div>\n" +
"				<div class=\"email right\">\n" +
"					<span class=\"circle\"><img src=\"data:image/svg+xml;charset=utf-8;base64,PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0idXRmLTgiPz4NCjwhLS0gR2VuZXJhdG9yOiBBZG9iZSBJbGx1c3RyYXRvciAxNS4xLjAsIFNWRyBFeHBvcnQgUGx1Zy1JbiAuIFNWRyBWZXJzaW9uOiA2LjAwIEJ1aWxkIDApICAtLT4NCjwhRE9DVFlQRSBzdmcgUFVCTElDICItLy9XM0MvL0RURCBTVkcgMS4xLy9FTiIgImh0dHA6Ly93d3cudzMub3JnL0dyYXBoaWNzL1NWRy8xLjEvRFREL3N2ZzExLmR0ZCI+DQo8c3ZnIHZlcnNpb249IjEuMSIgaWQ9IkxheWVyXzEiIHhtbG5zOnNrZXRjaD0iaHR0cDovL3d3dy5ib2hlbWlhbmNvZGluZy5jb20vc2tldGNoL25zIg0KCSB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHhtbG5zOnhsaW5rPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5L3hsaW5rIiB4PSIwcHgiIHk9IjBweCIgd2lkdGg9IjE0LjE3M3B4Ig0KCSBoZWlnaHQ9IjE0LjE3M3B4IiB2aWV3Qm94PSIwLjM1NCAtMi4yNzIgMTQuMTczIDE0LjE3MyIgZW5hYmxlLWJhY2tncm91bmQ9Im5ldyAwLjM1NCAtMi4yNzIgMTQuMTczIDE0LjE3MyIgeG1sOnNwYWNlPSJwcmVzZXJ2ZSINCgk+DQo8dGl0bGU+ZW1haWwxOTwvdGl0bGU+DQo8ZGVzYz5DcmVhdGVkIHdpdGggU2tldGNoLjwvZGVzYz4NCjxnIGlkPSJQYWdlLTEiIHNrZXRjaDp0eXBlPSJNU1BhZ2UiPg0KCTxnIGlkPSJJTlZPSUNFLTEiIHRyYW5zZm9ybT0idHJhbnNsYXRlKC00MTcuMDAwMDAwLCAtNTUuMDAwMDAwKSIgc2tldGNoOnR5cGU9Ik1TQXJ0Ym9hcmRHcm91cCI+DQoJCTxnIGlkPSJaQUdMQVZMSkUiIHRyYW5zZm9ybT0idHJhbnNsYXRlKDMwLjAwMDAwMCwgMTUuMDAwMDAwKSIgc2tldGNoOnR5cGU9Ik1TTGF5ZXJHcm91cCI+DQoJCQk8ZyBpZD0iS09OVEFLVEkiIHRyYW5zZm9ybT0idHJhbnNsYXRlKDI2Ny4wMDAwMDAsIDM1LjAwMDAwMCkiIHNrZXRjaDp0eXBlPSJNU1NoYXBlR3JvdXAiPg0KCQkJCTxnIGlkPSJPdmFsLTEtX3gyQl8tZW1haWwxOSIgdHJhbnNmb3JtPSJ0cmFuc2xhdGUoMTE3LjAwMDAwMCwgMC4wMDAwMDApIj4NCgkJCQkJPHBhdGggaWQ9ImVtYWlsMTkiIGZpbGw9IiM4QkMzNEEiIGQ9Ik0zLjM1NCwxNC4yODFoMTQuMTczVjUuMzQ2SDMuMzU0VjE0LjI4MXogTTEwLjQ0LDEwLjg2M0w0LjYyNyw2LjAwOGgxMS42MjZMMTAuNDQsMTAuODYzDQoJCQkJCQl6IE04LjEyNSw5LjgxMkw0LjA1LDEzLjIxN1Y2LjQwOUw4LjEyNSw5LjgxMnogTTguNjUzLDEwLjI1M2wxLjc4OCwxLjQ5M2wxLjc4Ny0xLjQ5M2w0LjAyOSwzLjM2Nkg0LjYyNEw4LjY1MywxMC4yNTN6DQoJCQkJCQkgTTEyLjc1NSw5LjgxMmw0LjA3NS0zLjQwM3Y2LjgwOEwxMi43NTUsOS44MTJ6Ii8+DQoJCQkJPC9nPg0KCQkJPC9nPg0KCQk8L2c+DQoJPC9nPg0KPC9nPg0KPC9zdmc+DQo=\" alt=\"\"><span class=\"helper\"></span></span>\n" +
"					<a href=\"mailto:company@example.com\">echoShop@echo.com</a>\n" +
"					<span class=\"helper\"></span>\n" +
"				</div>\n" +
"			</div>\n" +
"		</div>\n" +
"	</header>\n" +
"\n" +
"	<section>\n" +
"		<div class=\"container\">\n" +
"			<div class=\"details clearfix\">\n" +
"				<div class=\"client left\">\n" +
"					<p>Cliente: </p>\n" +
"					<p class=\"name\">"+v.getComprador().getNombre()+"</p>\n" +
"					<p>"+v.getComprador().getDomicilio()+"</p>\n" +
"				</div>\n" +
"				<div class=\"data right\">\n" +
"					<div class=\"title\">Venta</div>\n" +
"					<div class=\"date\">\n" +
"						"+v.getFechaDeCompra()+"<br>\n" +
"						Nro de venta: "+v.getCodigoIdentificadorDeVenta()+"\n" +
"					</div>\n" +
"				</div>\n" +
"			</div>\n" +
"\n" +
"			<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
"				<thead>\n" +
"					<tr>\n" +
"						<th class=\"desc\">Descrición del producto</th>\n" +
"						<th class=\"qty\">Cantidad</th>\n" +
"						<th class=\"unit\">Precio unitario</th>\n" +
"						<th class=\"total\">Total</th>\n" +
"					</tr>\n" +
"				</thead>\n" +
"				<tbody>\n" + productos +
"				</tbody>\n" +
"			</table>\n" +
"			<div class=\"no-break\">\n" +
"				<table class=\"grand-total\">\n" +
"					<tbody>\n" +
                "<tr>\n" +
"							<td class=\"desc\"></td>\n" +
"							<td class=\"unit\" colspan=\"2\">TOTAL:</td>\n" +
"							<td class=\"total\">"+v.getPrecioTotal()+"</td>\n" +
"						</tr>\n" +
"					</tbody>\n" +
"				</table>\n" +
"				</div>\n" +
"\n" +
"				<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
"					<thead>\n" +
"						<tr>\n" +
"							<th class=\"desc\">Nombre del Envase</th>\n" +
"							<th class=\"qty\">Identificador</th>\n" +
"							<th class=\"unit\">Peso Maximo</th>\n" +
"						</tr>\n" +
"					</thead>\n" +
"					<tbody>\n" +envases+
"					</tbody>\n" +
"				</table>\n" +
"\n" +
"		</div>\n" +
"	</section>\n" +
"\n" +
"	<footer>\n" +
"		<div class=\"container\">\n" +
"		<div class=\"end\">Esta factura fue creada en una computadora, y es válida, por lo que no necesita firma ni sello.</div>\n" +
"		</div>\n" +
"	</footer>\n" +
"\n" +
"</body>\n" +
"\n" +
"</html>";
        
        return retorno;
    }

    /*Agragar al registro de venta
    WebView webView = new WebView();
        String contenido = "";
        
        webView.getEngine().loadContent();
    
        VBox vBox = new VBox(webView);
        Scene scene = new Scene(vBox, 960, 600);

        primaryStage.setScene(scene);
        primaryStage.show();
    
    */
    
}
