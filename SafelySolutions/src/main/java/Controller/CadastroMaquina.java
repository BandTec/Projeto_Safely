package Controller;


import Model.Maquina;
import oshi.SystemInfo;
import oshi.hardware.*;
import oshi.software.os.OperatingSystem;

import java.sql.SQLException;

public class CadastroMaquina {


    public static Maquina cadastra() throws SQLException {
        Maquina maquina = new Maquina();
        ValidarLogin validarLogin = new ValidarLogin();
        SystemInfo system = new SystemInfo();

        OperatingSystem os = system.getOperatingSystem();

        HardwareAbstractionLayer hardware = system.getHardware();
        ComputerSystem maquinaos = hardware.getComputerSystem();

        maquina.setSO(os.getManufacturer());
        maquina.setSerialNumber(maquinaos.getSerialNumber());
        maquina.setVersao(os.getVersion().getVersion());
        maquina.setModelo(maquinaos.getModel());
        maquina.setDominio(os.getNetworkParams().getDomainName());
        maquina.setIPv4(os.getNetworkParams().getIpv4DefaultGateway());
        maquina.setIPv6(os.getNetworkParams().getIpv6DefaultGateway());
        maquina.setIdEstabelecimento(validarLogin.getIdEstabelecimento());
        maquina.setIdTipo(3);

        return maquina;
    }
}
