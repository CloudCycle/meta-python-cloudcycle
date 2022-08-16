
SUMMARY = "plugin and hook calling mechanisms for python"
HOMEPAGE = "https://github.com/pytest-dev/pluggy"
AUTHOR = "Holger Krekel <holger@merlinux.eu>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1c8206d16fd5cc02fa9b0bb98955e5c2"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/a1/16/db2d7de3474b6e37cbb9c008965ee63835bba517e22cdb8c35b5116b5ce1/pluggy-1.0.0.tar.gz"
SRC_URI[md5sum] = "daa6fddfb6cd364f3c82e52098911e4b"
SRC_URI[sha256sum] = "4224373bacce55f955a878bf9cfa763c1e360858e330072059e10bad68531159"

S = "${WORKDIR}/pluggy-1.0.0"

DEPENDS += " "
RDEPENDS_${PN} = ""

BBCLASSEXTEND = "native nativesdk"
