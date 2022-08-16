
SUMMARY = "Python library for the NMEA 0183 protcol"
HOMEPAGE = "https://github.com/Knio/pynmea2"
AUTHOR = "Tom Flanagan <tom@zkpq.ca>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bb5e173bc54080cb25079199959ba6b6"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/ca/6b/5009ac42b1f21fee5b68151e5536b03dc6ca5e5346a23fc943860680d91b/pynmea2-1.15.0.tar.gz"
SRC_URI[md5sum] = "b753a629c87a072604352c1aecee463d"
SRC_URI[sha256sum] = "8b83fa7e3e668af5e182ef1c2fd4a535433ecadf60d7b627280172d695a1646b"

S = "${WORKDIR}/pynmea2-1.15.0"

DEPENDS += " "
RDEPENDS_${PN} = ""

BBCLASSEXTEND = "native nativesdk"
