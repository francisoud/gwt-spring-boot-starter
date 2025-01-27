[![Actions Status](https://github.com/levigo/gwt-spring-boot-starter/workflows/Continuous%20Delivery/badge.svg)](https://github.com/levigo/gwt-spring-boot-starter/actions)
[![Docker Hub](https://img.shields.io/badge/MADE%20with-JAVA-RED.svg)](#JAVA)
[![Generic badge](https://img.shields.io/badge/current%20version-1.1.2-1abc9c.svg)](https://github.com/levigo/gwt-spring-boot-starter/tree/v1.1.2)

# A Spring-Boot Starter for Google Web Toolkit (GWT) applications

## Features
- integrate GWT compilation into the Spring application lifecycle 
- automatically register and deploy GWT-RPC endpoints
- transparently support GWT dev-mode without IDE-plugins etc.

## Usage
__Maven dependency__

    <dependency>
        <groupId>org.jadice.gwt.spring</groupId>
        <artifactId>gwt-spring-boot-starter</artifactId>
        <version>1.1.2</version>
    </dependency>

If you plan to use the devmode with Java 11 and above, you must supply the following JVM argument:
`--add-opens java.base/jdk.internal.loader=ALL-UNNAMED`

## License
This library is provided "as is" under the "three-clause BSD license". See [LICENSE.md](./LICENSE.md).
