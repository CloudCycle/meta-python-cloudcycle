
SUMMARY = "A lil' TOML parser"
HOMEPAGE = ""
AUTHOR = " <Taneli Hukkinen <hukkin@users.noreply.github.com>>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=aaaaf0879d17df0110d1aa8c8c9f46f5"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/c0/3f/d7af728f075fb08564c5949a9c95e44352e23dee646869fa104a3b2060a3/tomli-2.0.1.tar.gz"
SRC_URI[md5sum] = "d4341621d423a7ca6822e23d6d52bb9a"
SRC_URI[sha256sum] = "de526c12914f0c550d15924c62d72abc48d6fe7364aa87328337a31007fe8a4f"

S = "${WORKDIR}/tomli-2.0.1"

DEPENDS += " "
RDEPENDS_${PN} = ""

BBCLASSEXTEND = "native nativesdk"
