
SUMMARY = "DNS toolkit"
HOMEPAGE = "https://www.dnspython.org"
AUTHOR = "Bob Halley <halley@dnspython.org>"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5af50906b5929837f667dfe31052bd34"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/99/fb/e7cd35bba24295ad41abfdff30f6b4c271fd6ac70d20132fa503c3e768e0/dnspython-2.2.1.tar.gz"
SRC_URI[md5sum] = "c7172f4115cd7b60fd5037cfcd8f9408"
SRC_URI[sha256sum] = "0f7569a4a6ff151958b64304071d370daa3243d15941a7beedf0c9fe5105603e"

S = "${WORKDIR}/dnspython-2.2.1"

DEPENDS += " "
RDEPENDS_${PN} = ""

BBCLASSEXTEND = "native nativesdk"
