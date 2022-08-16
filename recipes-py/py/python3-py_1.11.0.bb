
SUMMARY = "library with cross-python path, ini-parsing, io, code, log facilities"
HOMEPAGE = "https://py.readthedocs.io/"
AUTHOR = "holger krekel, Ronny Pfannschmidt, Benjamin Peterson and others <pytest-dev@python.org>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a6bb0320b04a0a503f12f69fea479de9"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/98/ff/fec109ceb715d2a6b4c4a85a61af3b40c723a961e8828319fbcb15b868dc/py-1.11.0.tar.gz"
SRC_URI[md5sum] = "bde7dcc1cb452a1e10206ef2f811ba88"
SRC_URI[sha256sum] = "51c75c4126074b472f746a24399ad32f6053d1b34b68d2fa41e558e6f4a98719"

S = "${WORKDIR}/py-1.11.0"

DEPENDS += " ${PYTHON_PN}-setuptools-scm-native"
RDEPENDS_${PN} = ""

BBCLASSEXTEND = "native nativesdk"
