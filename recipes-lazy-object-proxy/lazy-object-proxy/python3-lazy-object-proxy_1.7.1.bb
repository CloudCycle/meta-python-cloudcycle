
SUMMARY = "A fast and thorough lazy object proxy."
HOMEPAGE = "https://github.com/ionelmc/python-lazy-object-proxy"
AUTHOR = "Ionel Cristian Mărieș <contact@ionelmc.ro>"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9c5c2c74370826468065c5702b8a1fcf"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/75/93/3fc1cc28f71dd10b87a53b9d809602d7730e84cc4705a062def286232a9c/lazy-object-proxy-1.7.1.tar.gz"
SRC_URI[md5sum] = "53e3ebae55a1b2568bee8a977f48dc98"
SRC_URI[sha256sum] = "d609c75b986def706743cdebe5e47553f4a5a1da9c5ff66d76013ef396b5a8a4"

S = "${WORKDIR}/lazy-object-proxy-1.7.1"

DEPENDS += " "
RDEPENDS_${PN} = ""

BBCLASSEXTEND = "native nativesdk"
