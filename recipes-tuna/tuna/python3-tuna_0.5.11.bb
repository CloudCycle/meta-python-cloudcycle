
SUMMARY = "Visualize Python performance profiles"
HOMEPAGE = "https://github.com/nschloe/tuna"
AUTHOR = "Nico Schlömer <nico.schloemer@gmail.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=1b10e2671d4c980325d9db121f9568f8"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/88/fb/5bf0865b2fdb44c0c62af24e77b5fe1bcfae4282b982a954fe7984587595/tuna-0.5.11.tar.gz"
SRC_URI[md5sum] = "cda69dfa691c9813249b48e7d42b2b8c"
SRC_URI[sha256sum] = "d47f3e39e80af961c8df016ac97d1643c3c60b5eb451299da0ab5fe411d8866c"

S = "${WORKDIR}/tuna-0.5.11"

DEPENDS += " "
RDEPENDS_${PN} = ""

BBCLASSEXTEND = "native nativesdk"
