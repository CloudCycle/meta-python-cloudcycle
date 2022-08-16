
SUMMARY = "reference implementation of PEP 3156"
HOMEPAGE = "http://www.python.org/dev/peps/pep-3156/"
AUTHOR = "Guido van Rossum (and others) <guido@python.org>"
LICENSE = "Python-2.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=8f7bb094c7232b058c7e9f2e431f389c"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/da/54/054bafaf2c0fb8473d423743e191fcdf49b2c1fd5e9af3524efbe097bafd/asyncio-3.4.3.tar.gz"
SRC_URI[md5sum] = "a189813096a6da1e46c16a41edb5f96d"
SRC_URI[sha256sum] = "83360ff8bc97980e4ff25c964c7bd3923d333d177aa4f7fb736b019f26c7cb41"

S = "${WORKDIR}/asyncio-3.4.3"

DEPENDS += " "
RDEPENDS_${PN} = ""

BBCLASSEXTEND = "native nativesdk"
