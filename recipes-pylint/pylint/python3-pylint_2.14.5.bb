
SUMMARY = "python code static checker"
HOMEPAGE = ""
AUTHOR = "Python Code Quality Authority <code-quality@python.org>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c107cf754550e65755c42985a5d4e9c9"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/82/e5/ae649803c4f3a4e47720337352af046089f8e9ff8a25958199df74268984/pylint-2.14.5.tar.gz"
SRC_URI[md5sum] = "6c095d6908c18fe69553e8a075fbe05b"
SRC_URI[sha256sum] = "487ce2192eee48211269a0e976421f334cf94de1806ca9d0a99449adcdf0285e"

S = "${WORKDIR}/pylint-2.14.5"

DEPENDS += " "
RDEPENDS_${PN} = "python3-dill python3-platformdirs python3-astroid python3-isort python3-mccabe python3-tomlkit"

BBCLASSEXTEND = "native nativesdk"
